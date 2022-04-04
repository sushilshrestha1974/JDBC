import java.sql.*;

public class MyfirstDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		// telling JDBC to useMySQL Driver
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","BhagawatI1976$$"); 
		//create, alter, drop-table in SQL - DDL- data definition language,
		// select, update, delete, insert-rows in SQL - DML data manipulation language
		
		//select statement
		Statement statement = connection.createStatement ();
		
		//create a string with query in it
		String query = "select * from products";
		
		//get all product from the database
		ResultSet products = statement.executeQuery(query);
		
		while (products.next()) {
			System.out.println(products.getString("productCode") + " " + products.getString("productName")+ " " + products.getDouble("MSRP"));
			
		}
	}
	
}
