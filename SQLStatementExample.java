import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLStatementExample
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String ip="jdbc:mysql//localhost:3306/asian_db";
			Connection conn=DriverManager.getConnection(ip);
			
			Statement st=conn.createStatement();
			
			ResultSet rs=st.executeQuery("SELECT * FROM CONTACT");
			while(rs.next())
			{
				String Name=rs.getString("E_name");
				String Address=rs.getString("E_address");
				String Phone=rs.getString("E_phone");
				System.out.println(Name+"/t"+Address+"/t"+Phone);
				
			}
			conn.close();
			st.close();
		}
		catch(SQLException sqlExcep)
		{
			System.out.println("Error:"+sqlExcep.getMessage());
		}
	}
}