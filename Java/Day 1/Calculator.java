import java.io.DataInputStream;

public class Calculator 
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0,c=0,d=0,e=0;
		float f=0.0f;
		try
		{
			System.out.print("Enter a number : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter a number : ");
			b=Integer.parseInt(in.readLine());
		}
		catch (Exception x) {}
		c=a+b;
		d=a-b;
		e=a*b;
		f=(float)a/b;
		System.out.println(c+" "+d+" "+e+" "+f);
	}
}
