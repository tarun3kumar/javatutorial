package interfaceandinheritance;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage implements Page {

    // Using interface WebDriver and not a specific implementation
    private WebDriver webDriver;
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnG");

    public GoogleHomePage(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    /**
     * search on google home page.
     *
     * @param   testData
     *
     * @return  page object of GoogleSearchResultPage
     */
    @Override
    public GoogleSearchResultPage search(final String testData) {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("Search on google home page, search data: " + testData);

        webDriver.findElement(searchBox).clear();     // steps can be run on any implementation of WebDriver. i.e. - FF,
                                                      // Chrome, IE etc
        webDriver.findElement(searchBox).sendKeys(testData);
        webDriver.findElement(searchButton).click();
        return new GoogleSearchResultPage(webDriver); // return page object of search result page
    }

    /**
     * @return  link name of all links on google home page
     */
    public List<String> getGoogleHomePageLinkText() {
        List<String> linkTexts = new ArrayList<String>();
        List<WebElement> linkElements = webDriver.findElements(By.tagName("a")); // findElements method to get
                                                                                 // collection of WebElement
        for (WebElement element : linkElements) {
            String linkText = element.getText();
            linkTexts.add(linkText);
        }

        return linkTexts;
    }
}
