package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

public class UIActions extends CommonOps {

    @Step("click on Element")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Clear Text in Element")
    public static void clearText(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
    }

    @Step("Update Text in Element")
    public static void updateText(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Update Text in Element")
    public static void updateText(WebElement elem, double text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(Double.toString(text));
    }

    @Step("update DropDown Element")
    public static void updateDropDown(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }

    @Step("Mouse Hover an Element")
    public static void mouseHover(WebElement elem1, WebElement elem2) {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step("Mouse Hover an Element")
    public static void mouseHover(WebElement elem1) {
        action.moveToElement(elem1).click().build().perform();
    }

    @Step("Taking String from Graph and cast it to double")
    public static Double StringFromGraph() {
        String[] soFar = mortgageGraph.getTxt_graphDot().getText().split("I");
        String[] taxes = soFar[0].split(": ");
        String[] tax = taxes[1].replaceAll("[^0-9.]", "").split(" ");
        return Double.parseDouble(tax[0]);
    }

    @Step("Adding Property Tax to Home Insurance")
    public static double AddingPropertyTaxToHomeIns(){
        return mortgageMain.add(Double.parseDouble(mortgageMain.getTxt_propertyTax().getAttribute("value")),
                Double.parseDouble(mortgageMain.getTxt_homeIns().getAttribute("value")));
    }
}
