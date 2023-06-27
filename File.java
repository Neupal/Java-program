import java.util.Scanner;
import java.io.*;

public class File
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence= sc.nextLine();
		try 
		{
			FileWriter fwV= new FileWriter("D:\\vowel.txt");
			FileWriter fwC= new FileWriter("D:\\consonant.txt");
			char c; 
			
			for(int i= 0; i<sentence.length(); i++)
			{
				c= sentence.charAt(i);
				if(c== 'a' || c== 'A' || c== 'e' || c== 'E' ||c== 'i' || c== 'I' 
						||c== 'u' || c== 'U')
				{
					fwV.write(c);
				}
				else {
					fwC.write(c);
				}
			}
			
			fwV.close();
			fwC.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}