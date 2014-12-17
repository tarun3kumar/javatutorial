package classesandobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class TestClass {

    public static void main(final String[] args) {
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        firefoxDriver.get("http://www.google.com/");

        GoogleHomePage googleHomePage = new GoogleHomePage();

        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("Test Name is: " + GoogleHomePage.getTestName());

        // search using different data types
        googleHomePage.search(firefoxDriver, "Selenium HQ");
        googleHomePage.search(firefoxDriver, 123);

        // search using variable argument
        String[] strArray = new String[3];
        strArray[0] = "Firefox Webdriver";
        strArray[1] = "Chrome Webdriver";
        strArray[2] = "IE Webdriver";
        googleHomePage.search(firefoxDriver, strArray);

        System.out.println("###################################");
        System.out.println("###################################");
        System.out.println("Get back to google home page");
        firefoxDriver.get("http://www.google.com/");

        String buttonLabel = googleHomePage.getSearchButtonLabel(firefoxDriver);
        System.out.println("return value is: " + buttonLabel);

        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(firefoxDriver);
        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("Test Data 1 is: " + GoogleSearchResultPage.getTestData1());
        System.out.println("Test Data 2 is: " + GoogleSearchResultPage.getTestData2());

        firefoxDriver.close();
        firefoxDriver.quit();
    }

}
