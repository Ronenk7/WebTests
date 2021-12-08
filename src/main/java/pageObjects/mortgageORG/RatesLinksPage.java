package pageObjects.mortgageORG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class RatesLinksPage extends CommonOps {

    @FindBy(how = How.LINK_TEXT, using = "FHA Loans")
    private WebElement link_FHALoans;

    @FindBy(how = How.LINK_TEXT, using = "VA Loans")
    private WebElement link_VALoans;

    @FindBy(how = How.LINK_TEXT, using = "USDA Loans")
    private WebElement link_USDALoans;

    @FindBy(how = How.LINK_TEXT, using = "Jumbo")
    private WebElement link_jumbo;

    @FindBy(how = How.LINK_TEXT, using = "Real APR")
    private WebElement link_realAPR;

    public WebElement getLink_FHALoans(){return link_FHALoans;}
    public WebElement getLink_VALoans(){return link_VALoans;}
    public WebElement getLink_USDALoans(){return link_USDALoans;}
    public WebElement getLink_jumbo(){return link_jumbo;}
    public WebElement getLink_realAPR(){return link_realAPR;}
}
