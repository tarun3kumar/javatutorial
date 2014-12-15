package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class FirefoxSelenium {

    // instance variable
    String searchResult;

    // class variable
    static String browser = "Firefox";

    public static void main(final String[] args) {

        // local variable
        int temp = 0;

        String[] searchResultLinks = new String[2];

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("www.google.com");
        firefoxDriver.findElement(By.name("q")).sendKeys("selenium HQ");
        firefoxDriver.findElement(By.name("btnG")).click();

        // watch first selenium training video http://www.seleniumtests.com/p/free-selenium-training.html
        // for more on element locators
        searchResultLinks[0] = firefoxDriver.findElement(By.cssSelector(".q.qs")).getText();
        searchResultLinks[1] = firefoxDriver.findElement(By.id("hdtb_more")).getText();

        System.out.println("First Link: " + searchResultLinks[0]);
        System.out.println("First Link: " + searchResultLinks[1]);

    }

}
