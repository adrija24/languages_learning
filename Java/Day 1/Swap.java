import java.io.DataInputStream;

public abstract class Swap
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0;
		try 
		{
			System.out.print("Enter value of 'a' : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter value of 'b' : ");
			b=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"\t"+"b="+b);
	}
}
