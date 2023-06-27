import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReadWrite
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr=new FileReader("D://Read.txt");
			FileWriter fw=new FileWriter("E://Write.txt");
			int c;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
				System.out.println((char)c);
			}
			fr.close();
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}