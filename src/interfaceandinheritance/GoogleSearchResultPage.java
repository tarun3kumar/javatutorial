package interfaceandinheritance;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultPage implements Page {

    // Using interface WebDriver and not a specific implementation
    private WebDriver webDriver;
    private By searchBox = By.name("q");
    private By searchButton = By.cssSelector("button[name='btnG']");
    private By resultStats = By.id("resultStats");

    public GoogleSearchResultPage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    /**
     * @param   testData
     *
     * @return  GoogleSearchResultPage instance
     */
    @Override
    public GoogleSearchResultPage search(final String testData) {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("Search on google search result page, search data: " + testData);

        webDriver.findElement(searchBox).clear();
        webDriver.findElement(searchBox).sendKeys(testData);
        webDriver.findElement(searchButton).click();

        return this;
    }

    // method specific to GoogleSearchResultPage
    public String getResultSet() {
        return webDriver.findElement(resultStats).getText();

    }

    /**
     * @return  link name of all links on google search result page
     */
    public List<String> getGoogleSearchResultPageLinkText() {
        List<String> linkTexts = new ArrayList<String>();
        List<WebElement> linkElements = webDriver.findElements(By.tagName("a"));
        for (WebElement element : linkElements) {
            String linkText = element.getText();
            linkTexts.add(linkText);
        }

        return linkTexts;
    }

}
