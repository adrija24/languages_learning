import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess
{
	static public void main(String args[])
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
		} 
		catch (Exception e) {}
		
		RandomAccessFile rFile;
		try
		{
			rFile = new RandomAccessFile("city.txt", "rw");
			rFile.seek(rFile.length());
			rFile.writeBytes("\tMUMBAI\n");
			rFile.close();
		}
		catch (IOException ioe) {System.out.print(ioe);}
	}
}
