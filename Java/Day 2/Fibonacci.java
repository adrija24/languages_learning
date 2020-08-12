import java.io.DataInputStream;
public class Fibonacci
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0,b=0,c=0,i=0,n=0;
		try 
		{
			System.out.print("Enter 1st number of the series : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter 2st number of the series : ");
			b=Integer.parseInt(in.readLine());
			System.out.print("Enter the range : ");
			n=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		System.out.print("The Fibonacci series will be - "+"\n"+a+"  "+b);
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
		}
	}

}

