package pageObjects.mortgageORG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CurrentMortgageRates {

    @FindBy(how = How.ID, using = "iFrameResizer0")
    private WebElement ifrm_currentMortgageRates;

    @FindBy(how = How.XPATH, using = "//*[@id='GridView6']/tbody/tr[2]/td[1]")
    private WebElement txt_15YearsRate;

    @FindBy(how = How.XPATH, using = "//*[@id='GridView6']/tbody/tr[3]/td[1]")
    private WebElement txt_30YearsRate;

    public WebElement getIfrm_currentMortgageRates(){return ifrm_currentMortgageRates;}
    public WebElement getTxt_15YearsRate(){return txt_15YearsRate;}
    public WebElement getTxt_30YearsRate(){return txt_30YearsRate;}
}
