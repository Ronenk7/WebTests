package pageObjects.mortgageORG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//div[@class='calculation-box']/h2")
    private WebElement head_title;

    @FindBy(how = How.ID, using = "toggle_pie")
    private WebElement link_loanBreakdown;

    @FindBy(how = How.ID, using = "homeval")
    private WebElement txt_homeValue;

    @FindBy(how = How.XPATH, using = "//input[@value='money']")
    private WebElement btn_money;

    @FindBy(how = How.XPATH, using = "//input[@value='percent']")
    private WebElement btn_percent;

    @FindBy(how = How.ID, using = "downpayment")
    private WebElement txt_downPayment;

    @FindBy(how = How.ID, using = "intrstsrate")
    private WebElement txt_interestRate;

    @FindBy(how = How.ID, using = "loanterm")
    private WebElement txt_loanTerm;

    @FindBy(how = How.NAME, using = "param[start_month]")
    private WebElement btn_startDate;

    @FindBy(how = How.ID, using = "start_year")
    private WebElement txt_startYear;

    @FindBy(how = How.ID, using = "pptytax")
    private WebElement txt_propertyTax;

    @FindBy(how = How.ID, using = "pmi")
    private WebElement txt_PMI;

    @FindBy(how = How.ID, using = "hoi")
    private WebElement txt_homeIns;

    @FindBy(how = How.ID, using = "hoa")
    private WebElement txt_monthlyHOA;

    @FindBy(how = How.NAME, using = "param[milserve]")
    private WebElement btn_loanType;

    @FindBy(how = How.NAME, using = "param[refiorbuy]")
    private WebElement btn_buyOrRefi;

    @FindBy(how = How.LINK_TEXT, using = "Show Amortization Tables ")
    private WebElement link_tables;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement btn_calculate;

    public WebElement getHead_title(){return head_title;}
    public WebElement getLink_loanBreakdown(){return link_loanBreakdown;}
    public WebElement getTxt_homeValue(){return txt_homeValue;}
    public WebElement getBtn_money(){return btn_money;}
    public WebElement getBtn_percent(){return btn_percent;}
    public WebElement getTxt_downPayment(){return txt_downPayment;}
    public WebElement getTxt_interestRate(){return txt_interestRate;}
    public WebElement getTxt_loanTerm(){return txt_loanTerm;}
    public WebElement getBtn_startDate(){return btn_startDate;}
    public WebElement getTxt_startYear(){return txt_startYear;}
    public WebElement getTxt_propertyTax(){return txt_propertyTax;}
    public WebElement getTxt_PMI(){return txt_PMI;}
    public WebElement getTxt_homeIns(){return txt_homeIns;}
    public WebElement getTxt_monthlyHOA(){return txt_monthlyHOA;}
    public WebElement getBtn_loanType(){return btn_loanType;}
    public WebElement getBtn_buyOrRefi(){return btn_buyOrRefi;}
    public WebElement getLink_tables(){return link_tables;}
    public WebElement getBtn_calculate(){return btn_calculate;}
    /*
    ###################################################################################
    Method name: add
    Method description: This method add two numbers
    Method parameters : double, double
    Method Return: double
    ###################################################################################
     */
    public static double add(double x, double y){
        return x + y ;
    }
}
