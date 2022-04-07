package pages;

import interfaces.IMortgageCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MortgagecalculatorPage extends BasePage implements IMortgageCalculatorPage {
    public MortgagecalculatorPage(WebDriver driver) {
        super(driver);
    }

    //Identifying elements (Finding) Or Locators
    @FindBy(id = "homeval")
    private WebElement homeValueElement;
    @FindBy(id = "downpayment")
    private WebElement downpaymentValueElement;
    @FindBy(id = "intrstsrate")
    private WebElement intrestsrateValueElement;
    @FindBy(id = "loanterm")
    private WebElement loantermValueElement;
    @FindBy(css = "select[name='param[start_month]']")
    private WebElement startMonthValueElement;
    @FindBy(id = "start_year")
    private WebElement start_yearValueElement;
    @FindBy(css = "input[type='submit']")
    private WebElement CalculateButtonElement;


    @FindBy (xpath = "//div[@class='repayment-block']/div/div/h3")
    private List<WebElement> RepaymentSummaryList;


    ///Methods to perform the action (Doing)

    public void EnterHomeValue(String hValue) {
        homeValueElement.sendKeys(hValue);
    }

    public void EnterDownPaymentValue(String dValue) {
        downpaymentValueElement.sendKeys(dValue);
    }

    public void EnterInterestRateValue(String intValue) {
        intrestsrateValueElement.sendKeys(intValue);
    }

    public void EnterLoanTermValue(String lTerm){
        loantermValueElement.sendKeys(lTerm);
    }

    public void SelectStartMonth(String sMonth) {
        Select select = new Select(startMonthValueElement);
        select.selectByVisibleText(sMonth);
    }

    public void EnterStartYear(String sYear) {
        start_yearValueElement.sendKeys(sYear);
    }

    public void ClickOnCalculateButton() {
        CalculateButtonElement.click();
    }

    public String GetTotalMonthlyPayment(){
        return RepaymentSummaryList.get(0).getText();
    }
    public String GetDownPaymentAmount(){
        return RepaymentSummaryList.get(2).getText();
    }
    public String GetDownPaymentPct(){
        return RepaymentSummaryList.get(3).getText();
    }
    public String GetLoanPayoffDate(){
        return RepaymentSummaryList.get(4).getText();
    }
    public String GetTotalInterestPaid(){
        return RepaymentSummaryList.get(5).getText();
    }
    public String GetTotalMonthlyTaxPaid(){
        return RepaymentSummaryList.get(6).getText();
    }

    @Override
    public void Accelerator() {
        System.out.println("hello");
    }

//    public void Accelerator(){
//        System.out.println("hello");
//    }
}
