package sanity;

import extensions.DBActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

import java.util.List;

@Listeners(utilities.Listeners.class)
public class MortgageWebDB extends CommonOps {

    @Test(description = "Test 01 - Verify Mortgage Parameters with DB Credentials")
    @Description("This test verify the mortgage form with DB credentials")
    public void test01_verifyMortgageCalculateDB() {
        String query = "SELECT home,payment,interest,term,year,tax,PMI,ins,HOA,expected FROM MortgageRepayment WHERE id='1'";
        List<String> cred = DBActions.getCredentials(query);
        WebFlows.mortgageRepaymentDB();
        Verifications.verifyText(mortgageSummary.getTxt_totalMonthlyPayment().getText(),
                cred.get(9));
    }

    @Test(description = "Test 02 - Verify Taxes & Fees with DB")
    @Description("This test verify the parameters (using soft assertion) with DB")
    public void test02_verifyCurrentTaxesAndFees() {
        WebFlows.selectingMortgageDB();
        WebFlows.mortgageTextFromGraph();
        Verifications.visibilityOfElements(listOfLists);
    }
}
