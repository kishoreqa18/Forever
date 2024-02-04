package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestUtils extends BaseClass {

    public void selectValueFromDropdown(String locator, String value) {
        try {
            String option = null;
            List<WebElement> dropdownvalues = new Select(driver.findElement(By.cssSelector(locator))).getOptions();
            for (int i = 0; i < dropdownvalues.size(); i++) {
                if (dropdownvalues.get(i).getText().trim().equalsIgnoreCase(value.trim().toLowerCase())) {
                    dropdownvalues.get(i).click();
                    option = dropdownvalues.get(i).getText();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void clickOnCountryAndLanguageDropdown() throws InterruptedException {

        Thread.sleep(10000);
        WebElement element = driver.findElement(By.cssSelector("country-language-selector button#chooseCountry"));
        ActionKeyword.javaScriptClick(element);

        WebElement regionTitle = driver.findElement(By.cssSelector("div>ul#regioanlCountrymenu-js>li:nth-child(7) div>span"));
        ActionKeyword.javaScriptClick(regionTitle);

        WebElement countrySelection = driver.findElement(By.cssSelector("div.countries-block ul#countryMenuList-js>li:nth-child(2) div>span"));
        Thread.sleep(3000);
        ActionKeyword.scrollToView(countrySelection);
        ActionKeyword.javaScriptClick(countrySelection);
        WebElement languageSelection  =driver.findElement(By.cssSelector("ul#languageMenuList-js>li:nth-child(1) div>span"));
        ActionKeyword.javaScriptClick(languageSelection);
        Thread.sleep(5000);
    }
}
