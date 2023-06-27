import java.sql.*;
public class PrepareStatementDelete
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian_db","root","");
			PreparedStatement stmt=con.prepareStatement("delete from contact where Name='Ramesh'");
			int i=stmt.executeUpdate();
			System.out.println("Delete successfully");
			con.close();
			stmt.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}