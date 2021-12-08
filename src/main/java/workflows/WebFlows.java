package workflows;

import extensions.DBActions;
import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.ArrayList;
import java.util.List;

public class WebFlows extends CommonOps {

    @Step("Business Flow: Fill Mortgage Form")
    public static void mortgageRepayment(String home,String payment ,String interest, String term, String year,
                                         String tax, String PMI, String ins, String HOA) {
        UIActions.updateText(mortgageMain.getTxt_homeValue(), home);
        UIActions.click(mortgageMain.getBtn_money());
        UIActions.updateText(mortgageMain.getTxt_downPayment(), payment);
        UIActions.updateText(mortgageMain.getTxt_interestRate(), interest);
        UIActions.updateText(mortgageMain.getTxt_loanTerm(), term);
        UIActions.updateText(mortgageMain.getTxt_startYear(), year);
        UIActions.updateDropDown(mortgageMain.getBtn_startDate(), "Jun");
        UIActions.updateText(mortgageMain.getTxt_propertyTax(), tax);
        UIActions.updateText(mortgageMain.getTxt_PMI(), PMI);
        UIActions.updateText(mortgageMain.getTxt_homeIns(), ins);
        UIActions.updateText(mortgageMain.getTxt_monthlyHOA(), HOA);
        UIActions.updateDropDown(mortgageMain.getBtn_loanType(), "FHA");
        UIActions.click(mortgageMain.getBtn_calculate());
    }

    @Step("Business Flow: Fill Mortgage Form with DB Credentials")
    public static void mortgageRepaymentDB() {
        String query = "SELECT home,payment,interest,term,year,tax,PMI,ins,HOA,expected FROM MortgageRepayment WHERE id='1'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.updateText(mortgageMain.getTxt_homeValue(), cred.get(0));
        UIActions.click(mortgageMain.getBtn_money());
        UIActions.updateText(mortgageMain.getTxt_downPayment(), cred.get(1));
        UIActions.updateText(mortgageMain.getTxt_interestRate(), cred.get(2));
        UIActions.updateText(mortgageMain.getTxt_loanTerm(), cred.get(3));
        UIActions.updateText(mortgageMain.getTxt_startYear(), cred.get(4));
        UIActions.updateDropDown(mortgageMain.getBtn_startDate(), "Jun");
        UIActions.updateText(mortgageMain.getTxt_propertyTax(), cred.get(5));
        UIActions.updateText(mortgageMain.getTxt_PMI(), cred.get(6));
        UIActions.updateText(mortgageMain.getTxt_homeIns(), cred.get(7));
        UIActions.updateText(mortgageMain.getTxt_monthlyHOA(), cred.get(8));
        UIActions.updateDropDown(mortgageMain.getBtn_loanType(), "FHA");
        UIActions.click(mortgageMain.getBtn_calculate());
    }

    @Step("Business Flow: Get Parameters Values of the Graph")
    public static void mortgageTextFromGraph() {
        UIActions.mouseHover(mortgageGraph.getGrph_graph());
        for (int i=1; i<mortgageGraph.getList_tasks().size()-1; i++) {
                UIActions.mouseHover(mortgageGraph.getList_tasks().get(i));
                mortgageGraph.getTxt_graphDot().getText().split("I")[1].replaceAll("[^0-9 .]", "").split(" ");
                List<Double> list = new ArrayList<>();
                list.add(Double.valueOf(mortgageGraph.getTxt_graphDot().getText().split("I")[1].replaceAll("[^0-9 .]", "").split(" ")[1]));
                list.add(Double.valueOf(mortgageGraph.getTxt_graphDot().getText().split("I")[1].replaceAll("[^0-9 .]", "").split(" ")[2]));
                list.add(Double.valueOf(mortgageGraph.getTxt_graphDot().getText().split("I")[1].replaceAll("[^0-9 .]", "").split(" ")[3]));
                listOfLists.add(list);
        }
        System.out.println(listOfLists);
    }

    @Step("Business Flow: Loan Breakdown Graph ")
    public static void loanBreakdownGraph() {
        UIActions.click(mortgageMain.getLink_loanBreakdown());
    }

    @Step("Business Flow: Selecting Mortgage for 15 Years")
    public static void selectingMortgage(String home, String payment , String term, String tax,  String ins, String rate) {
        UIActions.updateText(mortgageMain.getTxt_homeValue(), home);
        UIActions.click(mortgageMain.getBtn_percent());
        UIActions.updateText(mortgageMain.getTxt_downPayment(), payment);
        UIActions.updateText(mortgageMain.getTxt_loanTerm(), term);
        UIActions.updateText(mortgageMain.getTxt_propertyTax(), tax);
        UIActions.updateText(mortgageMain.getTxt_homeIns(), ins);
        UIActions.updateText(mortgageMain.getTxt_interestRate() ,rate);
        UIActions.click(mortgageMain.getBtn_calculate());
    }

    @Step("Business Flow: Selecting Mortgage for 15 Years with DB")
    public static void selectingMortgageDB()
    {
        String query = "SELECT home,payment,term,tax,ins FROM TaxesAndFees WHERE id='1'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.mouseHover(mortgageMenu.getLink_rates());
        driver.switchTo().frame(mortgageCurrentRates.getIfrm_currentMortgageRates());
        if(cred.get(2).equalsIgnoreCase("15")) {
            rate = UIActions.mortgageCurrentRates.getTxt_15YearsRate().getText();
        }
        else if(cred.get(2).equalsIgnoreCase("30")) {
            rate = UIActions.mortgageCurrentRates.getTxt_30YearsRate().getText();
        }
        else
            rate = "4";

        driver.switchTo().defaultContent();
        driver.get(getData("url"));
        UIActions.updateText(mortgageMain.getTxt_homeValue(), cred.get(0));
        UIActions.click(mortgageMain.getBtn_percent());
        UIActions.updateText(mortgageMain.getTxt_downPayment(), cred.get(1));
        UIActions.updateText(mortgageMain.getTxt_loanTerm(), cred.get(2));
        UIActions.updateText(mortgageMain.getTxt_propertyTax(), cred.get(3));
        UIActions.updateText(mortgageMain.getTxt_homeIns(), cred.get(4));
        UIActions.updateText(mortgageMain.getTxt_interestRate() ,rate);
        UIActions.click(mortgageMain.getBtn_calculate());
    }

  @Step("Business Flow: Fill Mortgage Form")
  public static void mortgageRepaymentDDT(String home, String payment ,String term,
                                        String tax, String ins) {

      UIActions.mouseHover(mortgageMenu.getLink_rates());
      driver.switchTo().frame(mortgageCurrentRates.getIfrm_currentMortgageRates());
      if(term.equalsIgnoreCase("15")) {
          rate = UIActions.mortgageCurrentRates.getTxt_15YearsRate().getText();
      }
      else if(term.equalsIgnoreCase("30")) {
          rate = UIActions.mortgageCurrentRates.getTxt_30YearsRate().getText();
      }
      else
          rate = "4";

      driver.switchTo().defaultContent();
      driver.get(getData("url"));
      UIActions.updateText(mortgageMain.getTxt_homeValue(), home);
      UIActions.click(mortgageMain.getBtn_money());
      UIActions.updateText(mortgageMain.getTxt_downPayment(), payment);
      UIActions.updateText(mortgageMain.getTxt_loanTerm(), term);
      UIActions.updateText(mortgageMain.getTxt_interestRate() ,rate);
      UIActions.updateText(mortgageMain.getTxt_propertyTax(), tax);
      UIActions.updateText(mortgageMain.getTxt_homeIns(), ins);
      UIActions.click(mortgageMain.getBtn_calculate());
  }
}
