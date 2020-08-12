import java.io.*;
public class Reverse 
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int m=0,s=0,n=0;
		try
		{
			System.out.print("Enter a number : ");
			n=Integer.parseInt(in.readLine());
		}
		catch(Exception x) {}
		while(n!=0)
		{
			m=n%10;
			n=n/10;
			s=s*10+m;
		}
		System.out.print("Reverse="+s);
	}
	
}
