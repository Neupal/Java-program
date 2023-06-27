import java.sql.*;
public class PrepareStatementUpdate
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian_db","root","");
			PreparedStatement stmt=con.prepareStatement("update contact set Name='Shyam' where Name='Arjun' ");
			int i=stmt.executeUpdate();
			System.out.println("Update succesfully");
			con.close();
			stmt.close();		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}