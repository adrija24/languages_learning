import java.io.DataInput;
import java.io.DataInputStream;

public class Add 
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0,c=0;
		try
		{
			System.out.print("Enter a number : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter a number : ");
			b=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		c=a+b;
		System.out.print(c);
	}
}
