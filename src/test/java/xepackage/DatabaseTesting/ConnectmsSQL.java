package xepackage.DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class ConnectmsSQL {

    //Connection Object 
    static Connection conn = null;
    //Statement Object
    public static Statement stmt;
    //Constant for Database URL
    public static String url = "jdbc:sqlserver://10.32.0.28:1433;databaseName=eDCTestTemp";
    //constant for Database username
    public static String user = "sa";
    //constant for Database password
    public static String password = "intas@123";

   @BeforeClass
    public void configConn() {

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database sucessfully");
            stmt = conn.createStatement();

        } catch (SQLException e) {
            System.out.println("Oops, there is an error:");
            e.printStackTrace();
        }
    }


    @AfterClass
    public void tearDown() throws SQLException {
        if(conn != null){
            conn.close();
        }
    }









}
