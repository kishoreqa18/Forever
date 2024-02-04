package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class BaseClass extends Constants {

    public static WebDriver driver=null;

    /*
     Launching Browser
      */

public static void launchBrowser() throws InterruptedException {
        switch (browserName){


            case "CHROME":
            System.setProperty("webdriver.chrome.driver",System.getProperty ("user.dir")+"//Drivers//chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                 driver = new ChromeDriver(chromeOptions.setHeadless(false));
                driver.get(URL);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                driver.findElement(By.cssSelector("button[aria-label=\"ACCEPT ALL\"]")).click();

                TestUtils.clickOnCountryAndLanguageDropdown();

                break;

            case "EDGE":
                break;
            case "FIREFOX":
                break;

        }


    }

    public static void main(String[] args) throws InterruptedException {
            launchBrowser();

        Thread.sleep(10000);
        driver.quit();
    }
}
