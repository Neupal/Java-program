import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Delete
{
	private static Connection con= null;
	
	public static void main(String[] args) 
	{
		
		Delete in= new Delete();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  // loading jdbc driver
			String dbURL= "jdbc:mysql://localhost:3306/asian_db";  //here "3306" is port number and "jdbcdb" is our database name  
			String username= "root";
			String password= "";
			
			con= DriverManager.getConnection(dbURL, username, password);
			in.insertRecord();
		}
		catch(Exception e) 
		{
			System.out.println("error Message:= " + e.getMessage());
		}
	}
	
	private void insertRecord() throws SQLException
	{
		String sql= "delete from contact where Name='Shyam'";
		Statement stmt= con.createStatement();
		
		int rows= stmt.executeUpdate(sql);
		
		if(rows>0) 
		{
			System.out.println("Record has been inserted successfully.");
		}
		else
		{
			System.out.println("Record has not been inserted properly.");
		}
	}
}