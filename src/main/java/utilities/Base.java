package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Base {
   // General
   protected static WebDriverWait wait;
   protected static Actions action;
   protected static SoftAssert softAssert;
   protected static List<List<Double>> listOfLists;
   public static String rate;
   protected static String Platform;

   // Web
   protected static WebDriver driver;

   // Database
   protected static Connection con;
   protected static Statement stmt;
   protected static ResultSet rs;

   // Page Objects - Web
   protected static pageObjects.mortgageORG.MainPage mortgageMain;
   protected static pageObjects.mortgageORG.GraphPage mortgageGraph;
   protected static pageObjects.mortgageORG.MenuPage mortgageMenu;
   protected static pageObjects.mortgageORG.RatesLinksPage mortgageRatesLinks;
   protected static pageObjects.mortgageORG.MortgageRepaymentSummary mortgageSummary;
   protected static pageObjects.mortgageORG.CurrentMortgageRates mortgageCurrentRates;
}
