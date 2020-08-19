import java.io.DataInputStream;
import java.io.IOException;

public class StringUpperCase
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		String s1=" ";
		int j=0;
		try
		{
			System.out.print("Enter the string : ");
			s1=in.readLine();
		}
		catch (IOException e) {}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=65&&s1.charAt(i)<=90)
			{
				j++;
			}
		}
		System.out.print("Total number of upper case : "+j);
	}
}