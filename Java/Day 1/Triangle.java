import java.io.DataInputStream;
import java.lang.*;
public class Triangle
{
	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0,c=0;
		float s=0.0f,ar=0.0f;
		try
		{
			System.out.print("Enter length of arm 'a' : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter length of arm 'b' : ");
			b=Integer.parseInt(in.readLine());
			System.out.print("Enter length of arm 'c' : ");
			c=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		s=(float)(a+b+c)/2;
		ar=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("Area="+ar);
	}
}
