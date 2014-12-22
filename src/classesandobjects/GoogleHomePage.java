package classesandobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePage {

    // instance variable with private access specifier
    private static final String TEST_NAME = "Google Tests With Selenium"; // constant
    private By searchBox = By.name("q");
    private By searchButton = By.cssSelector("button[name='btnK']");

    // static access to static member
    public static String getTestName() {
        return TEST_NAME;
    }

    // getter access to private instance variable
    public By getSearchBox() {
        return searchBox;
    }

    public By getSearchButton() {
        return searchButton;
    }

    public void search(final FirefoxDriver firefoxDriver, final String searchTerm) {
        System.out.println("###################################");
        System.out.println("###################################");
        System.out.println("Search using string search term: " + searchTerm);
        firefoxDriver.findElement(getSearchBox()).clear();
        firefoxDriver.findElement(getSearchBox()).sendKeys(searchTerm);
    }

    // overloaded methods
    public void search(final FirefoxDriver firefoxDriver, final int searchTerm) {
        System.out.println("###################################");
        System.out.println("###################################");
        System.out.println("Search using int search term: " + searchTerm);
        firefoxDriver.findElement(getSearchBox()).clear();
        firefoxDriver.findElement(getSearchBox()).sendKeys(String.valueOf(searchTerm));
    }

    // overloaded method with variable arguments
    public void search(final FirefoxDriver firefoxDriver, final String... searchTerm) {

        System.out.println("###################################");
        System.out.println("###################################");
        System.out.println("Search using multiple data sets");

        WebElement searchTextBox = firefoxDriver.findElement(getSearchBox());
        for (String testData : searchTerm) {
            System.out.println("Test Data: " + testData);
            firefoxDriver.findElement(getSearchBox()).clear();
            searchTextBox.sendKeys(testData);
        }
    }

    // method with return type
    public String getSearchButtonLabel(final FirefoxDriver firefoxDriver) {
        String buttonLabel = firefoxDriver.findElement(getSearchButton()).getText();
        return buttonLabel;

    }
}
