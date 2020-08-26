import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceBuffer 
{
	public static void main(String args[])
	throws IOException
	{
		byte cities[]= {'D','E','L','H','I',' ','K','O','L','K','A','T','A'};
		byte towns[]= {' ','N','A','B','A','D','W','I','P',' ','K','A','L','N','A'};
		FileOutputStream outfile1=null;
		FileOutputStream outfile2=null;
		try
		{
			outfile1=new FileOutputStream("city.txt");
			outfile2=new FileOutputStream("town.txt");
			outfile1.write(cities);
			outfile1.write(towns);
			outfile1.close();
			outfile2.close();
			File file1=new File("city.txt");
			File file2=new File("town.txt");
			BufferedReader bReader1=new BufferedReader(new FileReader(file1));
			BufferedReader bReader2=new BufferedReader(new FileReader(file2));
			String st1, st2;
			while((st1=bReader1.readLine())!=null)
			{
				System.out.print(st1);
			}
			while((st2=bReader1.readLine())!=null)
			{
				System.out.print(st2);
			}
		} 
		catch (FileNotFoundException ioe) {
			System.out.print("Error");
			ioe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream file1=null;
		FileInputStream file2=null;
		
		SequenceInputStream file3=null;
		System.out.print("\nAfter concatenation and buffering : ");
		file1=new FileInputStream("city.txt");
		file2=new FileInputStream("town.txt");
		
		file3=new SequenceInputStream(file1,file2);
		
		BufferedInputStream inBuffer = new BufferedInputStream(file3);
		BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
		
		int ch;
		while((ch=inBuffer.read())!=-1)
		{
			outBuffer.write((char)ch);
		}
		inBuffer.close();
		outBuffer.close();
		file1.close();
		file2.close();
	}
}
