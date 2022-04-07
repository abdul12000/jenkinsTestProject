package StepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MouseActionsStepDef  extends BaseUtil {

    private BaseUtil base;

    public MouseActionsStepDef(BaseUtil base) {
        this.base = base;
    }


    @Given("I am on the Next Website")
    public void i_am_on_the_next_website() {
        base.driver.manage().window().maximize();
     base.driver.get("https://www.next.co.uk/");

     //Accept cookies
     base.driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @When("I click on All lighting")
    public void i_click_on_all_lighting() {
        WebElement HomeLink = base.driver.findElement(By.linkText("HOME"));
        Actions actionProvider = new Actions(base.driver);
        // Performs mouse move action onto the element
        actionProvider.moveToElement(HomeLink).build().perform();

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(base.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='All Lighting']")));
        WebElement AllLigthingLink = base.driver.findElement(By.xpath("//a[@title='All Lighting']"));


        // Performs mouse move action onto the element
        actionProvider.moveToElement(AllLigthingLink);
        actionProvider.click(AllLigthingLink).build().perform();


    }
    @Then("I should see {string} displayed")
    public void i_should_see_displayed(String headerName) {
        // Write code here that turns the phrase above into concrete actions
//        assertThat(base.driver.findElement(By.xpath("//h1[contains(text(),'Indoor & Outdoor Lights')]")).isDisplayed(), is (equalTo(true)));
        assertThat(base.driver.findElement(By.xpath("//h1[contains(text(),'" +headerName +"')]")).isDisplayed(), is (equalTo(true)));
    }
}
