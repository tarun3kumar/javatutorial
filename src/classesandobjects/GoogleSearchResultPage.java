package classesandobjects;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class GoogleSearchResultPage {

    private FirefoxDriver firefoxDriver;

    // Constructor
    public GoogleSearchResultPage(final FirefoxDriver firefoxDriver) {
        this.firefoxDriver = firefoxDriver;
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
