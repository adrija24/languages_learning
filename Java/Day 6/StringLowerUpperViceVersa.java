import java.io.DataInputStream;
import java.io.IOException;

public class StringLowerUpperViceVersa
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		String s1=" ";
		int i=0;
		try
		{
			System.out.print("Enter the string : ");
			s1=in.readLine();
		}
		catch (IOException e) {}
		char str[]=s1.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			if(str[i]>=97&&str[i]<=122)
			{
				str[i]=(char)((int)str[i]-32);
			}
			else 
			{
				if(str[i]>=65&&str[i]<=90)
				{
					str[i]=(char)((int)str[i]+32);
				}
			}
		}
		System.out.print("The new form will be : ");
		for(i=0;i<s1.length();i++)
		{
			System.out.print(str[i]);
		}
	}
}