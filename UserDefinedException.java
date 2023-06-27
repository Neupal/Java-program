class CustomExceptionDemo extends Exception
{
	CustomExceptionDemo(String s)
	{
		super(s);
	}
}
public class UserDefinedException 
{
	public static void validate(int age) throws CustomExceptionDemo
	{
		if(age<18) 
		{
			throw new CustomExceptionDemo("not valid");	
		
		}
		else 
		{
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) 
	{
		
		try 
		{
			validate(12);
		}
		catch(Exception e) 
		{
			System.out.println("Exception occured: " + e.getMessage());
		}
	}
}
