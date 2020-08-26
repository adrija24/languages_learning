import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomIO 
{
	public static void main(String args[])
	{
		RandomAccessFile file = null;
		try 
		{
			file = new RandomAccessFile("rand.txt","rw");
			
			file.writeChar('x');
			file.writeInt(555);
			file.writeDouble(3.125852);
			
			file.seek(0);
			System.out.print(file.readInt());
			
			file.seek(file.length());
			System.out.print("\n");
			file.writeBoolean(false);
			
			file.seek(4);
			System.out.print(file.readBoolean());
			file.close();
		} 
		catch (IOException e) {System.out.print(e);}
	}
}
