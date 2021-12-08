package extensions;

import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.ArrayList;
import java.util.List;

public class DBActions extends CommonOps {

    @Step("Get Credentials from Database")
    public static List<String> getCredentials(String query) {
        List<String> credentials = new ArrayList<String>();
        try {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));
            credentials.add(rs.getString(3));
            credentials.add(rs.getString(4));
            credentials.add(rs.getString(5));
            credentials.add(rs.getString(6));
            credentials.add(rs.getString(7));
            credentials.add(rs.getString(8));
            credentials.add(rs.getString(9));
            credentials.add(rs.getString(10));
        } catch (Exception e) {
            System.out.println("Error occurred while printing table data , see details: " + e);
        }
        return credentials;
    }

    @Step("Get Credentials from Database")
    public static List<String> getCredentials1(String query) {
        List<String> credentials = new ArrayList<String>();
        try {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));
            credentials.add(rs.getString(3));
            credentials.add(rs.getString(4));
            credentials.add(rs.getString(5));
            credentials.add(rs.getString(6));
        } catch (Exception e) {
            System.out.println("Error occurred while printing table data , see details: " + e);
        }
        return credentials;
    }
}
