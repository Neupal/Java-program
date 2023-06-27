import java.rmi.*;
public class Server
{

	public static void main(String[] args)
	{
		try
		{
			AddC obj= new AddC();
			Naming.rebind("ADD", obj);
			System.out.println("Server Started");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}