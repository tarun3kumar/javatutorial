package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import classesandobjects.COUNTRY;
import classesandobjects.GoogleHomePage;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class EnumTestClass {

    private FirefoxDriver firefoxDriver;
    private GoogleHomePage googleHomePage = new GoogleHomePage();

    // using instance initializer instead of constructor initialization
    {
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void runTestOnGivenLocale(final COUNTRY country) {
        switch (country) {

            case FRANCE :
                System.out.println("Run selenium tests in France");

                // Test run logic
                googleHomePage.search(firefoxDriver, "Selenium user groups in france");
                break;

            case ITALY :
                System.out.println("Run selenium tests in Italy");
                googleHomePage.search(firefoxDriver, "Selenium user groups in Italy");
                break;

            case GERMANY :
                System.out.println("Run selenium tests in Germany");
                googleHomePage.search(firefoxDriver, "Selenium user groups in France");
                break;

            default :
                System.out.println("No valid test country specified!!!!");
        }

    }

    public void shutDownDriver() {
        firefoxDriver.close();
        firefoxDriver.quit();
    }

    public static void main(final String[] args) {
        EnumTestClass enumTestClass = new EnumTestClass();
        enumTestClass.firefoxDriver.get("http://www.google.com/");

        COUNTRY country1 = COUNTRY.GERMANY;

        enumTestClass.runTestOnGivenLocale(country1);

        COUNTRY country2 = COUNTRY.UK;
        enumTestClass.runTestOnGivenLocale(country2);

        enumTestClass.shutDownDriver();

    }

}
