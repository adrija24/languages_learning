import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteIntegers
{
	public static void main(String args[])
	{
		DataInputStream disDataInputStream=null;
		DataOutputStream dosDataOutputStream=null;
		
		File intFile=new File("Random.txt");
		
		try 
		{
			dosDataOutputStream=new DataOutputStream(new FileOutputStream(intFile));
			for(int i=0;i<10;i++)
			{
				dosDataOutputStream.writeInt((int) (Math.random()*100));
			}
		}
		catch (IOException ioe)
		{
			System.out.print(ioe.getMessage());
		}
		finally
		{
			try
			{
				dosDataOutputStream.close();
			} 
			catch (IOException ioe) {}
		}
		
		try
		{
			disDataInputStream=new DataInputStream(new FileInputStream(intFile));
			for(int i=0;i<10;i++)
			{
				int n=disDataInputStream.readInt();
				System.out.print(n+" ");
			}
		} 
		catch (IOException ioe)
		{
			System.out.print(ioe.getMessage());
		}
		finally 
		{
			try
			{
				disDataInputStream.close();
			} 
			catch (Exception e) {}
		}
	}
}
