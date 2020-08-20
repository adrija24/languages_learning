import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitive
{
	public static void main(String args[]) throws IOException
	{
		File primitive=new File("Prim.txt");
		FileOutputStream fos=new FileOutputStream(primitive);
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeInt(1998);
		dos.writeDouble(54646.454);
		dos.writeBoolean(false);
		dos.writeChar('A');
		dos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream(primitive);
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		dis.close();
		dis.close();
	}
}
