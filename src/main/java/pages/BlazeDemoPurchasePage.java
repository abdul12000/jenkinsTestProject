package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlazeDemoPurchasePage extends BasePage{
    public BlazeDemoPurchasePage(WebDriver driver) {
        super(driver);
    }
    //Identifying elements (Finding) Or Locators

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement purchaseFlightButton;


    ///Methods to perform the action (Doing)

    public void ClickOnPurchaseFlightButton(){
        purchaseFlightButton.click();
    }

}
