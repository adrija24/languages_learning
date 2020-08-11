import java.io.DataInputStream;
import java.lang.*;

public class Sum1
{
	public static void main(String[] args)
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,n=0;
		float s=0.0f;
		try 
		{
			System.out.print("Enter the range : ");
			n=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		for(i=1;i<=n;i++)
		{
			s=s+(float)1/i;
		}
		System.out.println("Sum="+s);
	}
}


