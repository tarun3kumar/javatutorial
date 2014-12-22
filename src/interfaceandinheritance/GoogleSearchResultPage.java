package interfaceandinheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResultPage implements Page {

    // Using interface WebDriver and not a specific implementation
    private WebDriver webDriver;
    private By searchBox = By.name("q");
    private By searchButton = By.cssSelector("button[name='btnG']");
    private By resultStats = By.id("resultStats");

    public GoogleSearchResultPage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Override
    public void search(final String testData) {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("Search on google search result page, search data: " + testData);

        webDriver.findElement(searchBox).clear();
        webDriver.findElement(searchBox).sendKeys(testData);
        webDriver.findElement(searchButton).click();
    }

    // method specific to GoogleSearchResultPage
    public String getResultSet() {
        return webDriver.findElement(resultStats).getText();

    }
}
