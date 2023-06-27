import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Insert
{
	private static Connection con= null;
	
	public static void main(String[] args) 
	{
		
		Insert in= new Insert();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbURL= "jdbc:mysql://localhost:3306/asian_db";
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
		String sql= "insert into contact(name, address, phone) values ('Neupal', 'Dhapashi', '9812391418')";
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