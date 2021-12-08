package pageObjects.mortgageORG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GraphPage {

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg']//*[name()='g'][2]")
    private WebElement grph_graph;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path' and @class='highcharts-point']")
    private List<WebElement> list_graphDots;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg']//*[name()='g'and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']")
    private WebElement txt_graphDot;

    public WebElement getGrph_graph(){
        return grph_graph;
    }
    public List<WebElement> getList_tasks(){return list_graphDots;}
    public WebElement getTxt_graphDot(){
        return txt_graphDot;
    }

}
