import java.io.DataInputStream;
import java.lang.*;

public class Prime 
{
	public static void main(String[] args)
	{
		DataInputStream in=new DataInputStream(System.in);
		int n=0,i=0,flag=0;
		try 
		{
			System.out.print("Enter the value of 'n' : ");
			n=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.print("It is a prime number");
		else
			System.out.print("It is not a prime number");
	}
}
