public class ExceptionHandelingExample
{
	public static void main(String[] args)
	{
		try
		{
			int a=100, b=0;
			int c=a/b;
			System.out.println("Divide:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero is not possible");
		}
		finally
		{
		System.out.println("Rest of code");
		}
	}
}