import java.io.DataInputStream;
import java.lang.*;

public class Quadratic
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0,c=0;
		float d=0.0f,x1=0.0f,x2=0.0f;
		try 
		{
			System.out.print("Enter the value of 'a' : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter the value of 'b' : ");
			b=Integer.parseInt(in.readLine());
			System.out.print("Enter the value of 'c' : ");
			c=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		d=b*b-4*a*c;
		if(d<0)
			System.out.println("Math Error");
		else
		{
			x1=(float)(-b+Math.sqrt(d))/(2*a);
			x2=(float)(-b-Math.sqrt(d))/(2*a);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}
	}
}

