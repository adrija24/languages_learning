import java.io.DataInputStream;
import java.lang.*;
public class Highest
{
	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0,c=0,d=0;
		try
		{
			System.out.print("Enter a number : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter a number : ");
			b=Integer.parseInt(in.readLine());
			System.out.print("Enter a number : ");
			c=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		d=((a>b&&a>c)?a:((b>a&&b>c)?b:c));
		System.out.print("Highest number="+d);
	}
}
