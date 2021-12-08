package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps {

    @Step("Verify Text in Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("Verify Text in Text")
    public static void verifyText(double actual, double expected) {
        assertEquals(actual, expected);
    }

    @Step("Verify Text in Text")
    public static void verifyText(String actual, String expected) {
        assertEquals(actual, expected);
    }

    @Step("Verify Text in Texts (Soft-Assertion")
    public static void visibilityOfElements(List<List<Double>> lists) {
        for (int i = 1; i < lists.size()-1; i++) {
            softAssert.assertTrue(lists.get(i).get(0) > lists.get(i + 1).get(0));
            softAssert.assertFalse(lists.get(i).get(1) > lists.get(i + 1).get(1));
            softAssert.assertTrue(lists.get(i).get(2) > lists.get(i + 1).get(2));
        }
        softAssert.assertAll();
    }

    @Step("Verify Number with Number")
    public static void verifyNumber(int actual, int expected){
        assertEquals(actual, expected);
    }
}
