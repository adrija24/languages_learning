import java.io.DataInputStream;

public class AllUpperLower
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		String s1 = " ",s2,s3;
		try 
		{
			System.out.print("Enter the string : ");
			s1=in.readLine();
		} 
		catch (Exception e) {}
		s2=s1.toLowerCase();
		s3=s1.toUpperCase();
		System.out.print("Converting to all lower : "+s2+"\nConverting to all upper : "+s3);
	}
}
