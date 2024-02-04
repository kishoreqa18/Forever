package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ActionKeyword extends TestUtils{

    /*
    Method Name: click
    Description: Click for Web elements in web page
     */
    public  void click(WebElement element, String locator) {
        switch (locator) {
            case ("CSS"):
                driver.findElement(By.cssSelector(locator)).click();
                break;
            case "XPATH":
                driver.findElement(By.xpath(locator)).click();
                break;

            case "ID":
                driver.findElement(By.id(locator)).click();
                break;
        }
    }
        /*
        Method Name: Enter
        Description: Enter any value in text boxes
         */
    public void enter(WebElement element, String value, String locator) {

        switch (locator) {
            case "CSS":
                driver.findElement(By.cssSelector(locator)).sendKeys(value);
                break;
            case "XPATH":
                driver.findElement(By.xpath(locator)).sendKeys(value);
                break;

            case "ID":
                driver.findElement(By.id(locator)).sendKeys(value);
                break;
        }
    }

        /*

        Method Name: SelectDropdown
        Description: To select value from Dropdown

         */
    public void selectDropdown(WebElement element,String locator, String value) {
        try {
            switch (locator) {
                case "CSS":
                    selectValueFromDropdown(locator, value);

                    break;
                case "XPATH":
                    selectValueFromDropdown(locator, value);
                    break;

                case "ID":
                    selectValueFromDropdown(locator, value);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + locator);
    }


}catch (Exception e){
    e.printStackTrace();
}
    }

    public static void javaScriptClick(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }


    public static void scrollToView(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView();", element);


    }











}
