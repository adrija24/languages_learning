
import java.io.DataInputStream;

public class Even 
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		float n=0;
		try
		{
			System.out.print("Enter the number : ");
			n=Float.parseFloat(in.readLine());
		} 
		catch (Exception e) {}
		if(n%2==0)
			System.out.print("Even");
		else {
			System.out.print("Odd");
		}
	}
}
