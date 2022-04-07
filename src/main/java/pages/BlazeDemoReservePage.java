package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlazeDemoReservePage extends BasePage{
    public BlazeDemoReservePage(WebDriver driver) {
        super(driver);
    }
    //Identifying elements (Finding) Or Locators
    @FindBy(xpath = "//h3")
    private WebElement reservePageHeader;

//    @FindBy(xpath = "//input[@type='submit']")
//    private WebElement chooseThisFlightButton;


    //Using List WebElement
    @FindBy(xpath = "//input[@type='submit']")
    private List<WebElement> chooseThisFlightButton;

    ///Methods to perform the action (Doing)
    public String getHeaderDetails(){
        return reservePageHeader.getText();
    }

//    public void ClickOnFirstChooseFlightButton(){
//        chooseThisFlightButton.click();
//    }

    //Method for using List
        public void ClickOnFirstChooseFlightButton(){
        for(int i =0; i<chooseThisFlightButton.size(); i++){
            System.out.println(chooseThisFlightButton.get(i).getText());

        }
            chooseThisFlightButton.get(3).click();
    }
}
