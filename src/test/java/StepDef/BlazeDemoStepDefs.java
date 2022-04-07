package StepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BlazeDemoConfirmationPage;
import pages.BlazeDemoLandingPage;
import pages.BlazeDemoPurchasePage;
import pages.BlazeDemoReservePage;
import utilities.ConfigReader;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class BlazeDemoStepDefs extends BaseUtil {
    private BaseUtil base;

    public BlazeDemoStepDefs(BaseUtil base) {
        this.base = base;
    }


    @Given("I am on the Welcome to Simple Travel Agency landing page")
    public void i_am_on_the_welcome_to_simple_travel_agency_landing_page() throws IOException {
     base.driver.manage().window().maximize();
//     base.driver.get("https://testblazedemo.com/");
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.GetBlazeDemo_Url());
    }
    @When("I choose the {string} and {string} from the drop down")
    public void i_choose_the_and_from_the_drop_down(String departureCity, String destinationCity) {
        // Write code here that turns the phrase above into concrete actions
        BlazeDemoLandingPage blazeDemoLandingPage = new BlazeDemoLandingPage(base.driver);
        blazeDemoLandingPage.selectDepartureCity(departureCity);
        blazeDemoLandingPage.selectDestinationCity(destinationCity);
        blazeDemoLandingPage.ClickOnFindFligthsButton();

    }
    @Then("I should be able to see {string} and {string} on the BlazeDemo reserve page")
    public void i_should_be_able_to_see_and_on_the_blaze_demo_reserve_page(String departureCity, String destinationCity) {
        // Write code here that turns the phrase above into concrete actions
     BlazeDemoReservePage blazeDemoReservePage = new BlazeDemoReservePage(base.driver);
     String TextsInHeaderOnTheReservePage = blazeDemoReservePage.getHeaderDetails();
     assertThat(TextsInHeaderOnTheReservePage.contains(departureCity),is(true));
        assertThat(TextsInHeaderOnTheReservePage.contains(destinationCity),is(true));
    }

    @When("I choose the {string} and {string} from the drop down on the landing page")
    public void i_choose_the_and_from_the_drop_down_on_the_landing_page(String depCity, String destCity) {
        i_choose_the_and_from_the_drop_down(depCity, destCity);
    }
    @When("I choose the first fligh from the reserve page")
    public void i_choose_the_first_fligh_from_the_reserve_page() {
BlazeDemoReservePage blazeDemoReservePage = new BlazeDemoReservePage(base.driver);
blazeDemoReservePage.ClickOnFirstChooseFlightButton();
    }
    @When("I click Purchase Flight button on the Purchase page")
    public void i_click_purchase_flight_button_on_the_purchase_page() {
        BlazeDemoPurchasePage blazeDemoPurchasePage = new BlazeDemoPurchasePage(base.driver);
        blazeDemoPurchasePage.ClickOnPurchaseFlightButton();
    }
    @Then("{string} message is displayed on the confirmation page")
    public void message_is_displayed_on_the_confirmation_page(String msg) {
        BlazeDemoConfirmationPage blazeDemoConfirmationPage = new BlazeDemoConfirmationPage(base.driver);
        assertThat(blazeDemoConfirmationPage.GetHeaderOnConfirmationPage(), is(equalTo(msg)));
    }

}
