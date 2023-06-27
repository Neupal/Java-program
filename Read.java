import java.sql.*;
public class Read
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian_db","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from contact");
			while(rs.next())
			{
				String name=rs.getString("Name");
				String address=rs.getString("Address");
				String phone=rs.getString("Phone");
				System.out.println(name+"\t"+address+"\t"+phone);
				
			}
			System.out.println("Read successfully");
			con.close();
			stmt.close();
			rs.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}