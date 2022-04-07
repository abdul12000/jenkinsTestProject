package StepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UkbaStepDefs extends BaseUtil {
    private BaseUtil base;

    public UkbaStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on UKBA website{string}")
    public void iAmOnUKBAWebsite(String ukbaUrl) {
        base.driver.manage().window().maximize();
        base.driver.get(ukbaUrl);
//        base.driver.navigate().to(ukbaUrl);

//        base.driver.findElement(By.cssSelector("button[data-accept-cookies='true']")).click();
        try {
        WebElement acceptCookie = base.driver.findElement(By.xpath("//button[contains(text(),'Accept additional cookies')]"));

            if (acceptCookie.isDisplayed()) {
                acceptCookie.click();
            }
        }catch(Exception e){
            System.out.println(e);
        }



    }

    @Given("I provide a nationality of Japan")
    public void i_provide_a_nationality_of_japan() {
        WebElement countryElement = base.driver.findElement(By.xpath("//select[@id='response']"));
        Select select = new Select(countryElement);
        select.selectByVisibleText("Japan");

    }

    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        //      base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        WebElement continueButton = base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
        continueButton.click();
    }

    @When("I select the reason as Study")
    public void i_select_the_reason_as_study() {
        WebElement studyElement = base.driver.findElement(By.xpath("//input[@id='response-2']"));
        studyElement.click();

    }

    @When("I state that I intend to stay for more than {int} months")
    public void i_state_that_i_intend_to_stay_for_more_than_months(Integer int1) {
        WebElement lenghtOfStayElement = base.driver.findElement(By.xpath("//input[@id='response-1']"));
        lenghtOfStayElement.click();

    }

    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String expectedMsg) {
//        WebElement msgElement = base.driver.findElement(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]"));
//        assertThat(msgElement.getText(),is(equalTo(expectedMsg)));
        List<WebElement> msgElements = base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]"));
        System.out.println("1st element is :" + msgElements.get(0).getText());
        System.out.println("2nd element is :" + msgElements.get(1).getText());
        assertThat(msgElements.get(0).getText(), is(equalTo(expectedMsg)));

    }


    @And("I select the reason as Tourism")
    public void iSelectTheReasonAsTourism() {
        WebElement tourismElement = base.driver.findElement(By.id("response-0"));
        tourismElement.click();
    }

    @And("I state I am not travelling or visiting a partner or family")
    public void iStateIAmNotTravellingOrVisitingAPartnerOrFamily() {
        WebElement noAnswerElement = base.driver.findElement(By.cssSelector("input[id='response-1']"));
        noAnswerElement.click();
    }

    @Given("I provide a nationality of {string}")
    public void iProvideANationalityOf(String countryName) {
        WebElement countryElement = base.driver.findElement(By.xpath("//select[@id='response']"));
        Select select = new Select(countryElement);
        select.selectByVisibleText(countryName);

    }
}
