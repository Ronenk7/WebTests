package pageObjects.mortgageORG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class MortgageRepaymentSummary extends CommonOps {

    @FindBy(how = How.XPATH, using = "//div[@class='cal-right-box']/div//h3")
    private WebElement txt_totalMonthlyPayment;

    public WebElement getTxt_totalMonthlyPayment(){return txt_totalMonthlyPayment;}
}
