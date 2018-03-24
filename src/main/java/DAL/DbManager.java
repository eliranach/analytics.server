package DAL;

import java.sql.*;

//this class
public class DbManager {

    public static void connectToDB() {
        try {
            //create connection to database
            Connection conn_se = DriverManager.getConnection("jdbc:mysql://localhost:3306/se", "root", "fw3rcYxa");

            //create sql query statement
            Statement stmt = conn_se.createStatement();

            //save the returned results in a ResultSet object
            ResultSet myRs = stmt.executeQuery("select * from users");

            //print out the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("container_name") + ", " + myRs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("failed db connection - main");
        }
    }
}
