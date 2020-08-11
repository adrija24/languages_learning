import java.io.DataInputStream;

public class Conversion1
{
	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int C=0;
		float F=0.0f;
		try
		{
			System.out.print("Enter temperature in degree celcius : ");
			C=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		F=(float)(9*C+160)/5;
		System.out.print("Value in fahrenheit = "+F);
	}
}
