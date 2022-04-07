package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlazeDemoConfirmationPage extends BasePage {
    public BlazeDemoConfirmationPage(WebDriver driver) {
        super(driver);
    }

    //Identifying elements (Finding) Or Locators
    @FindBy(xpath = "//h1")
    private WebElement headerElement;


    ///Methods to perform the action (Doing)
    public String GetHeaderOnConfirmationPage(){
        return headerElement.getText();
    }


}
