/**
 * Database "test_db" is located at:
 *      C:\ProgramData\MySQL\MySQL Server 8.0\Data
 * See notes in text files: 
 *       C:\Users\Tender\Documents\MySQL
 *       MySQL_command-line.txt and Setting-Up-Java-Database.txt
 */
import java.sql.*;

public class SimpleJdbc {
  public static void main(String[] args)
      throws SQLException, ClassNotFoundException {
    // Load the JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");   // com.mysql.jdbc.Driver (this is deprecated)
    System.out.println("Driver loaded");

    // Connect to a database
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook" , "scott", "tiger");
    System.out.println("Database connected");

    // Create a statement
    Statement statement = connection.createStatement();

    // Execute a statement
    ResultSet resultSet = statement.executeQuery("select firstName, mi, lastName from Student where lastName = 'smith'");

    // Iterate through the result and print the student names
    while (resultSet.next())
      System.out.println(resultSet.getString(1) + "  \t  " +
        resultSet.getString(2) + "  \t  " + resultSet.getString(3));

    // Close the connection
    connection.close();
  }
}
