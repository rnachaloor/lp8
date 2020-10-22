package nachaloor.six;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection con = null;

    /**
     * Makes connection to a database
     */
    public static void connect() {
        try {
            String sqlUrl = "jdbc:sqlite:C:/sqlite/grades.db";
            con = DriverManager.getConnection(sqlUrl);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns the sql connection
     * @return returns the sql connection
     */
    public static Connection getCon() {
        //validation
        return con;
    }
    
    /**
     * Checks the grade in the class and prints it onto the console.
     */
    public static void gradesCheck() {
        
    }
    
    /**
     * Allows the user to add assignments to the database.
     */
    public static void addGrades() {
        
    }
    
    
}
