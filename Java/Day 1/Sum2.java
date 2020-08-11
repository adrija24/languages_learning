import java.io.DataInputStream;
import java.lang.*;

public class Sum2 
{
	public static void main(String[] args)
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,n=0,x=0,s=0;
		try 
		{
			System.out.print("Enter the value of 'x' : ");
			x=Integer.parseInt(in.readLine());
			System.out.print("Enter the range : ");
			n=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		for(i=1;i<=n;i++)
		{
			s=(int) (s+Math.pow(x,i));
		}
		System.out.println("Sum="+s);
	}
}

