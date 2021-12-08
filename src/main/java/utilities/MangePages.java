package utilities;

import org.openqa.selenium.support.PageFactory;

public class MangePages extends Base{
    /*
    ###################################################################################
    Method name: initMortgage
    Method description: This method initialize the elements
    ###################################################################################
     */
    public static void initMortgage() {
        mortgageMain = PageFactory.initElements(driver, pageObjects.mortgageORG.MainPage.class);
        mortgageGraph = PageFactory.initElements(driver, pageObjects.mortgageORG.GraphPage.class);
        mortgageMenu = PageFactory.initElements(driver, pageObjects.mortgageORG.MenuPage.class);
        mortgageRatesLinks = PageFactory.initElements(driver, pageObjects.mortgageORG.RatesLinksPage.class);
        mortgageSummary = PageFactory.initElements(driver, pageObjects.mortgageORG.MortgageRepaymentSummary.class);
        mortgageCurrentRates = PageFactory.initElements(driver, pageObjects.mortgageORG.CurrentMortgageRates.class);
    }
}
