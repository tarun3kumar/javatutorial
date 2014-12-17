package classesandobjects;

import org.openqa.selenium.WebDriver;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class GoogleSearchResultPage {

    private WebDriver webDriver;

    // Constructor
    GoogleSearchResultPage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private static String testData1;
    private static String testData2;

    static {
        testData1 = "software testing";
        testData2 = "performance testing";
    }

    public static String getTestData1() {
        return testData1;
    }

    public static String getTestData2() {
        return testData2;
    }
}
