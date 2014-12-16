package basics;

import java.util.concurrent.TimeUnit;

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
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        firefoxDriver.get("http://www.google.com");

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

        firefoxDriver.close();
        firefoxDriver.quit();

    }

}
