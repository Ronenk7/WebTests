package pageObjects.mortgageORG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class MenuPage extends CommonOps {

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Calcs")
    private WebElement link_mortgageCalcs;

    @FindBy(how = How.LINK_TEXT, using = "Refinance")
    private WebElement link_refinance;

    @FindBy(how = How.XPATH, using = "//a[text()='Rates']")
    private WebElement link_rates;

    @FindBy(how = How.LINK_TEXT, using = "ARM")
    private WebElement link_ARM;

    @FindBy(how = How.LINK_TEXT, using = "Affordability")
    private WebElement link_affordAbility;

    @FindBy(how = How.LINK_TEXT, using = "Save Money")
    private WebElement link_saveMoney;

    @FindBy(how = How.LINK_TEXT, using = "Advice")
    private WebElement link_advice;

    @FindBy(how = How.LINK_TEXT, using = "Financial Calcs")
    private WebElement link_financialCalcs;

    @FindBy(how = How.LINK_TEXT, using = "Widgets")
    private WebElement link_widgets;

    public WebElement getLink_mortgageCalcs(){return link_mortgageCalcs;}
    public WebElement getLink_refinance(){
        return link_refinance;
    }
    public WebElement getLink_rates(){
        return link_rates;
    }
    public WebElement getLink_ARM(){
        return link_ARM;
    }
    public WebElement getLink_affordAbility(){
        return link_affordAbility;
    }
    public WebElement getLink_saveMoney(){
        return link_saveMoney;
    }
    public WebElement getLink_advice(){
        return link_advice;
    }
    public WebElement getLink_financialCalcs(){
        return link_financialCalcs;
    }
    public WebElement getLink_widgets(){
        return link_widgets;
    }
}
