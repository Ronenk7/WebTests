package sanity;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class MortgageWeb extends CommonOps {

    @Test(description = "Test 01 - Verify Header")
    @Description("This test verify the header")
    public void test01_verifyHeader() {
        Verifications.verifyTextInElement(mortgageMain.getHead_title(), "Mortgage Calculator");
    }

    @Test(description = "Test 02 - Verify Mortgage Parameters")
    @Description("This test verify the mortgage form")
    public void test02_verifyMortgageCalculate() {
        WebFlows.mortgageRepayment("500000","100000","3.1","25","2021",
                "1500","0.5","1000","0");
        Verifications.verifyText(mortgageSummary.getTxt_totalMonthlyPayment().getText(),
                "$2,126.05");
    }

    @Test(description = "Test 03 - Verify Taxes & Fees")
    @Description("This test verify taxes & fees")
    public void test03_verifyCurrentTaxesAndFees() {
        WebFlows.selectingMortgage("500000","20","15", "1500", "1000", "4");
        WebFlows.mortgageTextFromGraph();
        Verifications.verifyText(UIActions.StringFromGraph(), UIActions.AddingPropertyTaxToHomeIns());
        listOfLists.clear();
    }

    @Test(description = "Test 04 - Verify Balance Principle & Interest", dataProvider = "data-provider-mortgage",
            dataProviderClass = utilities.ManageDDT.class)
    @Description("This test verify the parameters using soft assertion and DDT")
    public void test04_verifyBalancePrincipleAndInterest(String home, String payment, String term, String tax, String ins) {
        WebFlows.mortgageRepaymentDDT(home, payment, term, tax, ins);
        WebFlows.mortgageTextFromGraph();
        Verifications.visibilityOfElements(listOfLists);
        listOfLists.clear();
    }
}
