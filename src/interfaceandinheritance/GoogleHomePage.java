package interfaceandinheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage implements Page {

    // Using interface WebDriver and not a specific implementation
    private WebDriver webDriver;
    private By searchBox = By.name("q");

    public GoogleHomePage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Override
    public void search(final String testData) {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("Search on google home page, search data: " + testData);

        webDriver.findElement(searchBox).clear(); // steps can be run on any implementation of WebDriver. i.e. - FF,
                                                  // Chrome, IE etc
        webDriver.findElement(searchBox).sendKeys(testData);
    }
}
