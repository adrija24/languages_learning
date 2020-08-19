import java.io.DataInputStream;
import java.io.IOException;

public class StringLowerCase
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
			if(s1.charAt(i)>=97&&s1.charAt(i)<=122)
			{
				j++;
			}
		}
		System.out.print("Total number of lower case : "+j);
	}
}