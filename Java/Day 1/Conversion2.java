import java.io.DataInputStream;

public class Conversion2
{
	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int F=0;
		float C=0.0f;
		try
		{
			System.out.print("Enter temperature in degree fahrenheit : ");
			F=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		C=(float)(5*F-160)/9;
		System.out.print("Value in celcius = "+C);
	}
}
