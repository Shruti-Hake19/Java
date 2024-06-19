package JDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {

    public static void main(String[]args) throws SQLException {

        // Create the Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

        // Create a statement query
        Statement statement = connection.createStatement();

        //Execute a statement query
        String str =  "Create table Emp (EmpId int" +
                "       ,EmpName varchar(20)" +
                "       ,Address varchar(30)" +
                "       ,double salary)";

      statement.executeUpdate(str);
        System.out.println("Table Created");

       statement.close();
       connection.close();


    }
}
