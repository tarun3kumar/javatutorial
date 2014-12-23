package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

    public static void main(final String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver"); // load my sql jdbc driver

        String connectionURL = "jdbc:mysql://hostname:port/dbname";
        Connection connection = DriverManager.getConnection(connectionURL, "username", "password");
        Statement statement = connection.createStatement();

        System.out.println("#########################################");
        System.out.println("#########################################");
        System.out.println("using select statement");

        String selectQuery = "SELECT * FROM user ";
        ResultSet resultSet1 = statement.executeQuery(selectQuery);
        while (resultSet1.next()) {
            String userName = resultSet1.getString("firstname");
            System.out.println("User name is: " + userName);
        }

        System.out.println("#########################################");
        System.out.println("#########################################");
        System.out.println("using update statement");

        String updateQuery = "UPDATE user" + " SET username = 'testuser' " + " WHERE user_id = 1";
        statement.executeQuery(updateQuery);

        statement.close();
        connection.close();

    }
}
