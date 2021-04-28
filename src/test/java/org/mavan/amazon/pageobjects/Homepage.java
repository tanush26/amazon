package org.mavan.amazon.pageobjects;

import org.mavan.amazon.driverfactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {

    @FindBy(css = "#sp-cc-accept")
    private WebElement acceptCookies;
    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;
    @FindBy(css = "#nav-search-submit-button")
    private WebElement magnifierGlass;

//to search iphone in homepage/searchPage

    public void searchItem(String customerSelectedProduct) {
        acceptCookies.click();
        searchBox.sendKeys(customerSelectedProduct);
        magnifierGlass.click();
    }

    //for assertion
    public String getUrl() {
        return driver.getCurrentUrl();
    }

    @FindBy(xpath = "//span[@class='a-size-medium']")
    private WebElement firstResultWord;

    public String resultWord() {
        return firstResultWord.getText();

    }
}

