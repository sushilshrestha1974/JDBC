import java.sql.*;

public class Jdbcudemy {
	public static void main(String[] args) throws SQLException{
		Connection myConn  = null;
		Statement myStat 	= null;
		ResultSet myRs	=null;
		try {
		//get a connection	
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/udemyemployee","root","BhagawatI1976$$");
		//System.out.println("Database connection successfull!\n);");
		//create a statement
		myStat =myConn.createStatement();
		//Insert a new employee
		System.out.println("Inserting a new employee to database\n");
				
		int rowsAffected = myStat.executeUpdate("insert into employees" +"(last_name, first_name, email,Department)"+ "values" + "('Wright','Eric', 'eric.wright@gmail.com', 'HR')");
		//very this by getting a list of employees
		myRs=myStat.executeQuery("select * from employees order by last_name");
				
		//Executive SQL query
		myRs=myStat.executeQuery("select * from employees");
		//process the result set
		while (myRs.next()) {
			System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name") + " "+myRs.getString("email") + " "+ myRs.getString("Department"));
		}
		}
		catch (Exception e){
			e.printStackTrace();   
			
		}
}
}