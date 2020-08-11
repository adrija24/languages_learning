import java.io.DataInputStream;
public class Rectangle
{
	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0,c=0,d=0;
		try
		{
			System.out.print("Enter length of arm 'a' : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter length of arm 'b' : ");
			b=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		c=2*(a+b);
		d=a*b;
		System.out.print("Perimeter="+c+"\t"+"Area="+d);
	}
}
