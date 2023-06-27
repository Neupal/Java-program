import java.sql.*;
import java.lang.*;
public class PrepareStatementInsert
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian_db","root","");
			PreparedStatement stmt=con.prepareStatement("insert into contact(Name,Address,Phone) values(?,?,?)");
			
			stmt.setString(1,"Ramesh");
			stmt.setString(2,"Tokha");
			stmt.setString(3,"9818243567");
			int i=stmt.executeUpdate();
			System.out.println("Insert Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}