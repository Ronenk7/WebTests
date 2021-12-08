package utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps {
    /*
    ###################################################################################
    Method name: openConnection
    Method description: This method makes a connection to the database
    Method parameters : String, String, String
    ###################################################################################
     */
    public static void openConnection(String dbURL, String user, String pass )
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, pass);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error occurred while connecting to DB, see details: " + e);
        }
    }
    /*
    ###################################################################################
    Method name: closeConnection
    Method description: This method closes the connection to the database
    ###################################################################################
     */
    public static void closeConnection() {
        try {
            con.close();
        } catch (Exception e) {
                System.out.println("Error occurred while closing DB, see details: " + e);
        }
    }

}
