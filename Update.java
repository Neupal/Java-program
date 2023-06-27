import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Update
{
	private static Connection con= null;
	
	public static void main(String[] args) 
	{
		
		Update up= new Update();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  // loading jdbc driver
			String dbURL= "jdbc:mysql://localhost:3306/asian_db";  //here "3306" is port number and "jdbcdb" is our database name  
			String username= "root";
			String password= "";
			
			con= DriverManager.getConnection(dbURL, username, password);
			up.updateRecord();
		}
		catch(Exception e) 
		{
			System.out.println("error Message:= " + e.getMessage());
		}
	}
	
	private void updateRecord() throws SQLException
	{
		String sql= "update contact set Name='Shyam', Address='Tokha', Phone='9802378167' where Name='Arjun'";
		PreparedStatement stmt= con.prepareStatement(sql);
		
		int rows= stmt.executeUpdate();
		
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