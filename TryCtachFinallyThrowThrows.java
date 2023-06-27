import java.io.*;
public class TryCtachFinallyThrowThrows 
{
  public static void main(String[] args) 
  {
    try 
    {
      int a=100, b=0;
      int c=a/b;
      System.out.println("Divide:" +c );
    } 
    catch (ArithmeticException e) 
    {
      System.out.println("Divide by zero is not possible");
    } 
    finally 
    {
      System.out.println("End of program");
    }
  }
  public static int divide(int a, int b) throws ArithmeticException
  {
    if (b == 0) 
    {
      throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
  }
}