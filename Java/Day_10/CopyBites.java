import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyBites
{
	public static void main(String args[])
	{
		byte cities[]= {'D','E','L','H','I','\t','K','O','L','K','A','T','A'};
		FileOutputStream outfile=null;
		try
		{
			outfile=new FileOutputStream("city.txt");
			outfile.write(cities);
			outfile.close();
			File file=new File("city.txt");
			BufferedReader bReader=new BufferedReader(new FileReader(file));
			String st;
			while((st=bReader.readLine())!=null)
			{
				System.out.print(st);
			}
		} 
		catch (FileNotFoundException ioe) {
			System.out.print("Error");
			ioe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream in=null;
		FileOutputStream out=null;
		byte byteRead = 0;
		try
		{
			in=new FileInputStream("city.txt");
			out=new FileOutputStream("out.txt");
			do 
			{
				byteRead = (byte) in.read();
				out.write(byteRead);
			} 
			while(byteRead!=-1);
			{
				byteRead=(byte) in.read();
				out.write(byteRead);
			}
		}
		catch (FileNotFoundException e) 
		{
			System.out.print("File not found");
		}
		catch (IOException e)
		{
			System.out.print(e.getMessage());
		}
		finally 
		{
			try
			{
				in.close();
				out.close();
			}
			catch (Exception e2) {}
		}
		
	}
}
