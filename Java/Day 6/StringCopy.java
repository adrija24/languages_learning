import java.io.DataInputStream;
import java.io.IOException;

public class StringCopy
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		String s1 ="",s2="";
		int i=0;
		try 
		{
			System.out.print("Enter the string : ");
			s1=in.readLine();
		} 
		catch (Exception e) {}
		for(i=0;i<s1.length();i++)
			s2=s2+s1.charAt(i);
		System.out.print("After copy : "+s2);
		
	}
}