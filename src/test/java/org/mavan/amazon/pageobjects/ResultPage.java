package org.mavan.amazon.pageobjects;

import org.mavan.amazon.driverfactory.DriverFactory;
import org.mavan.amazon.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriverFactory {
    Helper helper = new Helper();

//User selected filtered product Iphone randomly
    @FindBy(css = ".a-size-medium")
    private List<WebElement> productsList;

    public String products() throws InterruptedException {
        int product = productsList.size();
        System.out.println(product);
        int randomList = helper.random(product);
        String productsInString = productsList.get(randomList).getText();
        System.out.println(productsInString);
        Thread.sleep(2000);
        productsList.get(randomList).click();
        return productsInString;
    }

    @FindBy(css = "#add-to-cart-button")
    private WebElement add;
    @FindBy(xpath = "(//input[@class='a-button-input'])[2]")
    private WebElement noThanks;

    //Adding product Iphone to Basket
    public void basket() throws InterruptedException {
       Thread.sleep(2000);
       add.click();
       noThanks.click();
    }

    @FindBy(xpath = "//*[@id='attach-sidesheet-checkout-button']/span/input")
    private WebElement checkOutButton;
    @FindBy(css = "#hlb-ptc-btn-native")
    private WebElement checkoutButton;
    //to checkout
    public void checkOut() {
       /* if (checkOutButton == driver.findElement(By.xpath("//*[@id='attach-sidesheet-checkout-button']/span/input"))
        ) {
            checkOutButton.click();
        }  else if
            (checkoutButton == driver.findElement(By.cssSelector("#hlb-ptc-btn-native"))) {*/
            checkoutButton.click();
        }
    


    @FindBy(css = "#ap_email")
    private WebElement credential1;
    @FindBy(css=".a-button-input")
    private WebElement continueButton;
    @FindBy(css = "#ap_password")
    private WebElement pwdButton;
    @FindBy(css = "#signInSubmit")
    private WebElement submit;
    @FindBy(css = "#address-ui-widgets-enterAddressPhoneNumber")
    private WebElement phoneNo;
    @FindBy(css = "#address-ui-widgets-enterAddressPostalCode")
    private WebElement postCode;
    @FindBy(css = "#address-ui-widgets-enterAddressLine1")
    private WebElement address1;
    @FindBy(css = ".a-button-input")
    private WebElement addAddress;
    @FindBy(css = "#address-ui-widgets-enterAddressCity")
    private WebElement town;
    @FindBy(xpath = "(//input[@class = 'a-button-input'])[3]")
    private WebElement saveAddress;
    @FindBy(xpath = "(//input[@class='a-button-text'])[1]")
    private WebElement proceed;

    // Entering login credentials,saving address and getting payment page displayed
    public void credentials() throws InterruptedException {
     credential1.sendKeys("rf392864@gmail.com");
     continueButton.click();
     pwdButton.sendKeys("rose@jasmine");
     submit.click();
     phoneNo.sendKeys("123456");
     postCode.sendKeys("UB34FL");
     address1.sendKeys("Hayes");
     town.sendKeys("Hounslow");
     Thread.sleep(3000);
     addAddress.click();
     saveAddress.click();
     proceed.click();
    }

    @FindBy(xpath ="//h1[@class='a-spacing-base']")
    private WebElement assertion2;

    //for ResultsPage assertion
    public String paymentPage(){
        return assertion2.getText();

    }
}



