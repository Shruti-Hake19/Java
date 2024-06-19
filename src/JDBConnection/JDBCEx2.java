package JDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx2 {
    public static void main(String[]args) throws SQLException {
        // Create the Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

        // Create a statement query
        Statement statement = connection.createStatement();

       //Insert query
        String str =  "Insert into Emp values (101,'Shruti','pune')";
        statement.executeUpdate(str);

//        // release the resources
        statement.close();
       connection.close();


    }
}
