package StepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import javaBasics.Person;
import javaBasics.Storage;
import pages.MortgagecalculatorPage;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

public class MortageCalculatorStepDefs  extends BaseUtil {
    private BaseUtil base;

    public MortageCalculatorStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the Mortgage Calculator website")
    public void i_am_on_the_mortgage_calculator_website() throws IOException {
base.driver.manage().window().maximize();
//base.driver.navigate().to("https://www.mortgagecalculator.org/");
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.GetMortgageCalc_Url());
        Person person = new Person();
        person.setSex("male");
        Storage.setName("Abdul");
    }
    @When("I enter the following")
    public void i_enter_the_following(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        MortgagecalculatorPage mortgagecalculatorPage = new MortgagecalculatorPage(base.driver);
        mortgagecalculatorPage.EnterHomeValue(dataTable.get(1).get(1));
        mortgagecalculatorPage.EnterDownPaymentValue(dataTable.get(2).get(1));
        mortgagecalculatorPage.EnterInterestRateValue(dataTable.get(3).get(1));
        mortgagecalculatorPage.EnterLoanTermValue(dataTable.get(4).get(1));
        mortgagecalculatorPage.SelectStartMonth(dataTable.get(5).get(1));
        mortgagecalculatorPage.EnterStartYear(dataTable.get(6).get(1));
        mortgagecalculatorPage.ClickOnCalculateButton();

    }
    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {
        // Write code here that turns the phrase above into concrete actions

        Person person = new Person();
        System.out.println(person.getSex());


    }
//    @Then("I should get mortage offer with {string}, {string}, {string}, {string}, {string} and {string}")
//    public void i_should_get_mortage_offer_with_and(String tMonthlyPyt, String dPayAmt, String dPayPct, String lPayofDate, String tIntrt, String mTaxPaid) {
//      MortgagecalculatorPage mortgagecalculatorPage = new MortgagecalculatorPage(base.driver);
//      assertThat(mortgagecalculatorPage.GetTotalMonthlyPayment(), is(equalTo(tMonthlyPyt)));
//        assertThat(mortgagecalculatorPage.GetDownPaymentAmount(), is(equalTo(dPayAmt)));
//        assertThat(mortgagecalculatorPage.GetDownPaymentPct(), is(equalTo(dPayPct)));
//        assertThat(mortgagecalculatorPage.GetLoanPayoffDate(), is(equalTo(lPayofDate)));
//        assertThat(mortgagecalculatorPage.GetTotalInterestPaid(), is(equalTo(tIntrt)));
//        assertThat(mortgagecalculatorPage.GetTotalMonthlyTaxPaid(), is(equalTo(mTaxPaid)));
//    }

}
