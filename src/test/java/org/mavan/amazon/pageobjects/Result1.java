package org.mavan.amazon.pageobjects;

import org.mavan.amazon.driverfactory.DriverFactory;
import org.mavan.amazon.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Result1 extends DriverFactory {
    Helper helper = new Helper();
    @FindBy(css = ".rush-component")
    private List<WebElement> productsLists;

    //User selected filtered product Iphone
    public void productSelection(String customerSelectedProduct){
    for(WebElement productsList:productsLists){
        if(productsList.getText().equalsIgnoreCase(customerSelectedProduct)){
            helper.jse();
            productsList.click();
            break;
        }
    }
    }

}
