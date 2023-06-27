import java.sql.Connection;
import java.sql.DriverManager;

public class database
{
	private static Connection conn=null;
	
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("Connect:mysql://localhost:3306/dataset","root", "root");
			conn.prepareStatement("insert into employee(name, address) values('Dipak', 'btk')").executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}