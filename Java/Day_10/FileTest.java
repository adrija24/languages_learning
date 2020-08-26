import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest 
{
	public static void main(String args[])
	{
		int ch1;
		char ch2;
		File f=new File("invent.txt");
		FileReader fr=null;
		FileWriter fw=null;
		try 
		{
			fw = new FileWriter(f);
			System.out.print("Enter anything : ");
			while((ch2=(char)System.in.read())!='\n')
			{
				ch1=(int)ch2;
				fw.write(ch1);
			}
			fw.close();
			fr=new FileReader(f);
			System.out.print("File content : ");
			while((ch1=fr.read())!=-1)
			{
				System.out.print((char)ch1);
			}
		}
		catch (Exception e)
		{
			System.out.print(e.getMessage());
		}
		finally
		{
			try 
			{
				fr.close();
				fw.close();
			}
			catch (Exception e2) {}
		}
	}
}
