import java.io.*;

public class WriteReadByte 
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
	}
}
