import java.io.DataInputStream;

public class StringSpace 
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		String s1=" ";
		int i=0,j=0;
		try
		{
			System.out.print("Enter the string : ");
			s1=in.readLine();
		}
		catch (Exception e) {}
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
				j++;
		}
		System.out.print("Number of spaces = "+j);
	}
}
