package testclasses.classesandobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import classesandobjects.Country;
import classesandobjects.GoogleHomePage;
import classesandobjects.ModifiedCountry;

public class EnumTestClass {

    private FirefoxDriver firefoxDriver;
    private GoogleHomePage googleHomePage = new GoogleHomePage();

    // using instance initializer instead of constructor initialization
    {
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void runTestOnGivenLocale(final Country country) {
        switch (country) {

            case FRANCE :
                System.out.println("Run selenium tests in France");

                // Test run logic
                googleHomePage.search(firefoxDriver, "Selenium user groups in France");
                break;

            case ITALY :
                System.out.println("Run selenium tests in Italy");
                googleHomePage.search(firefoxDriver, "Selenium user groups in Italy");
                break;

            case GERMANY :
                System.out.println("Run selenium tests in Germany");
                googleHomePage.search(firefoxDriver, "Selenium user groups in Germany");
                break;

            default :
                System.out.println("No valid test country specified!!!!");
        }

    }

    public void searchCountryAttributes(final ModifiedCountry country) {
        if (country.getLanguage().equals("English")) {
            googleHomePage.search(firefoxDriver, country.getLanguage());
            googleHomePage.search(firefoxDriver, country.getCapital());
        }
    }

    public void shutDownDriver() {
        firefoxDriver.close();
        firefoxDriver.quit();
    }

    public static void main(final String[] args) {
        EnumTestClass enumTestClass = new EnumTestClass();
        enumTestClass.firefoxDriver.get("http://www.google.com/");

        System.out.println("######################");
        System.out.println("######################");
        System.out.println("Using valid test domain: Germany");

        Country country1 = Country.GERMANY;
        enumTestClass.runTestOnGivenLocale(country1);

        System.out.println("######################");
        System.out.println("######################");
        System.out.println("using invalid test domain: UK");

        Country country2 = Country.UK;
        enumTestClass.runTestOnGivenLocale(country2);

        System.out.println("######################");
        System.out.println("######################");
        System.out.println("Iterating through values of enum");

        for (Country country : Country.values()) {
            System.out.println("Country is: " + country);
        }

        System.out.println("######################");
        System.out.println("######################");
        System.out.println("Test on modified country list");

        ModifiedCountry country3 = ModifiedCountry.UK;
        enumTestClass.searchCountryAttributes(country3);

        enumTestClass.shutDownDriver();

    }

}
