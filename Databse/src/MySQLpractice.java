import java.sql.*;
import java.util.*;


public class MySQLpractice {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement=null;
	private ResultSet resultSet = null;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","BhagawatI1976$$"); 
		Statement statement = connect.createStatement ();
		String query = "select * from products"; 
		 ResultSet products = statement.executeQuery(query);
		 
		 //Prepared statements can use variable and are more efficient
		 preparedStatement =connect.prepareStatement("insert into classicmodels.products values (?, ?,?, ?, ?, ?");
	
		 preparedStatement.setString(1, "Test");
		 preparedStatement.setString(2, "TestEmail");
		 preparedStatement.setString(3, "TestWebpage");
		 preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
		 preparedStatement.setString(5, "TestSummary");
		 preparedStatement.setString(6, "TestComment");
		 preparedStatement.executeUpdate();
		 
		 preparedStatement=connect.prepareStatement(Select ..args.)
		 
	}
		 
}
		 
		 
		 
		 