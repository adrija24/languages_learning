import java.io.DataInputStream;
import java.lang.*;

public class Factorial 
{
	public static void main(String[] args)
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,n=0,f=1;
		float s=0.0f;
		try 
		{
			System.out.print("Enter the value of 'n' : ");
			n=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial="+f);
	}
}
