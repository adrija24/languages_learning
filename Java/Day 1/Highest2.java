import java.io.DataInputStream;
import java.lang.*;
public class Highest2
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
			System.out.print("Enter a number : ");
			c=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		if (a>b&&a>c)
		{
			System.out.print("Highest number="+a);
		}
		else
		{
			if (b>c&&b>a)
			{
				System.out.print("Highest number="+b);
			}
			else
			{
				System.out.print("Highest number="+c);
			}
		}
	}
}
