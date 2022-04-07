package StepDef;

import base.BaseUtil;
import io.cucumber.java.en.Then;
import javaBasics.Storage;
import pages.MortgagecalculatorPage;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneralStepDef extends BaseUtil {
    private BaseUtil base;

    public GeneralStepDef(BaseUtil base) {
        this.base = base;
    }

//    @When("accept default value for all the remaining values")
//    public void accept_default_value_for_all_the_remaining_values() {
//        // Write code here that turns the phrase above into concrete actions
//
//        Person person = new Person();
//        System.out.println(person.getSex());
//
//    }
        @Then("I should get mortage offer with {string}, {string}, {string}, {string}, {string} and {string}")
        public void i_should_get_mortage_offer_with_and(String tMonthlyPyt, String dPayAmt, String dPayPct, String lPayofDate, String tIntrt, String mTaxPaid) {
            MortgagecalculatorPage mortgagecalculatorPage = new MortgagecalculatorPage(base.driver);
            assertThat(mortgagecalculatorPage.GetTotalMonthlyPayment(), is(equalTo(tMonthlyPyt)));
            assertThat(mortgagecalculatorPage.GetDownPaymentAmount(), is(equalTo(dPayAmt)));
            assertThat(mortgagecalculatorPage.GetDownPaymentPct(), is(equalTo(dPayPct)));
            assertThat(mortgagecalculatorPage.GetLoanPayoffDate(), is(equalTo(lPayofDate)));
            assertThat(mortgagecalculatorPage.GetTotalInterestPaid(), is(equalTo(tIntrt)));
//            assertThat(mortgagecalculatorPage.GetTotalMonthlyTaxPaid(), is(equalTo(mTaxPaid)));


            System.out.println(Storage.getName());

            List<String> arrayOfTax = Arrays.asList("$180.00", "$200.00", "$200", "200", mTaxPaid);
            System.out.println(arrayOfTax.get(2));
            System.out.println(arrayOfTax.size());
            assertThat(arrayOfTax, hasItem(mortgagecalculatorPage.GetTotalMonthlyTaxPaid()));

        }


}
