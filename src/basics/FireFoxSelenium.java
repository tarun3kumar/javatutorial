package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class FireFoxSelenium {

    // instance variable
    String searchResult;

    // class variable
    static String browser = "Firefox";

    public static void main(final String[] args) {

        // local variable
        int temp = 0;

        FireFoxSelenium firefoxSelenium1 = new FireFoxSelenium();
        FireFoxSelenium firefoxSelenium2 = new FireFoxSelenium();

        firefoxSelenium1.searchResult = "for instance firefoxSelenium1";
        firefoxSelenium2.searchResult = "for instance firefoxSelenium2";

        System.out.println("######################################");
        System.out.println("######################################");
        System.out.println("Access instance variable");
        System.out.println("First object state: " + firefoxSelenium1.searchResult);
        System.out.println("Second object state: " + firefoxSelenium2.searchResult);

        System.out.println("######################################");
        System.out.println("######################################");
        System.out.println("Access class variable");
        System.out.println(FireFoxSelenium.browser);

        // Array
        String[] searchResultLinks = new String[2];

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        firefoxDriver.get("http://www.google.com");

        // methods accepting by parameter
        firefoxDriver.findElement(By.name("q")).sendKeys("selenium HQ");
        firefoxDriver.findElement(By.name("btnG")).click();

        // watch first selenium training video http://www.seleniumtests.com/p/free-selenium-training.html
        // for more on element locators
        searchResultLinks[0] = firefoxDriver.findElement(By.linkText("Videos")).getText();
        searchResultLinks[1] = firefoxDriver.findElement(By.linkText("News")).getText();

        System.out.println("######################################");
        System.out.println("######################################");
        System.out.println("Access array elements");
        System.out.println("First Link: " + searchResultLinks[0]);
        System.out.println("Second Link: " + searchResultLinks[1]);

        System.out.println("######################################");
        System.out.println("######################################");
        System.out.println("Conditional Flow Statement");
        if (firefoxDriver.findElement(By.linkText("Videos")).isDisplayed()) {
            System.out.println("Web Link is present");
        }

        if (firefoxDriver.findElement(By.id("resultStats")).getText().equals("microsoft")) {
            System.out.println("microsoft is present");
        } else {
            System.out.println("microsoft is not present");
        }

        System.out.println("######################################");
        System.out.println("######################################");
        System.out.println("For loop and break statement");
        for (String str : searchResultLinks) {
            System.out.println(str);
            if (str.equals("Videos")) {
                break;
            }
        }

        System.out.println("######################################");
        System.out.println("######################################");

        firefoxDriver.close();
        firefoxDriver.quit();

    }

}
