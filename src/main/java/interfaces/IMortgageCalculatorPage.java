package interfaces;

public interface IMortgageCalculatorPage {
    //every method in an interface must be abstract method.
    void Accelerator();

    void EnterHomeValue(String hValue);

    void EnterDownPaymentValue(String dValue);

    void EnterInterestRateValue(String intValue);

    void EnterLoanTermValue(String lTerm);

    void SelectStartMonth(String sMonth);

    void EnterStartYear(String sYear);

    void ClickOnCalculateButton();

    String GetTotalMonthlyPayment();

    String GetDownPaymentAmount();

    String GetDownPaymentPct();

    String GetLoanPayoffDate();

    String GetTotalInterestPaid();

    String GetTotalMonthlyTaxPaid();

}
