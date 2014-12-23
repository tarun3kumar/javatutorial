package testclasses.collectionframeworkandselenium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import interfaceandinheritance.GoogleHomePage;
import interfaceandinheritance.GoogleSearchResultPage;

/**
 * Selenium example with List, Set and Map.
 */
public class TestClass {

    public static void main(final String[] args) throws InterruptedException {

        // instantiate WebDriver
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Set collection of  test URLs
        Set<String> urlSet = new HashSet<String>();

        GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);
        webDriver.get("http://www.google.com/");

        // collection google home page URL
        String googleHomePageURL = webDriver.getCurrentUrl();
        urlSet.add(googleHomePageURL);

        // print link text on google home page
        List<String> googleHomePageLinkTexts = googleHomePage.getGoogleHomePageLinkText();
        System.out.println("###################################");
        System.out.println("###################################");
        System.out.println("Print google home page link text");
        for (String linkText : googleHomePageLinkTexts) {
            System.out.println("link Text is: " + linkText);
        }

        // access google search result page from google home page
        GoogleSearchResultPage googleSearchResultPage = googleHomePage.search("selenium headquarter");
        Thread.sleep(5000); // Very bad practice, never use sleep statements in your programs

        // collect URL for google search result page
        String googleSearchResultPageURL = webDriver.getCurrentUrl();
        urlSet.add(googleSearchResultPageURL);

        // print link text on google search result page
        List<String> googleSRPLinkTexts = googleSearchResultPage.getGoogleSearchResultPageLinkText();
        System.out.println("###################################");
        System.out.println("###################################");
        System.out.println("Print google search result page link text");
        for (String linkText : googleSRPLinkTexts) {
            System.out.println("link Text is: " + linkText);
        }

        // create map of URL set
        Map<Integer, String> urlMap = new HashMap<Integer, String>();
        int index = 0;
        for (String url : urlSet) {
            urlMap.put(index, url);
            index++;
        }

        // print test URLs
        for (Integer key : urlMap.keySet()) {
            System.out.println("key is: " + key);
            System.out.println("url value is: " + urlMap.get(key));
        }

        // shutdown driver
        webDriver.close();
        webDriver.quit();

    }

}
