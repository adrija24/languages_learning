import java.io.DataInputStream;

public class StringVowel 
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
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
				j++;
		}
		System.out.print("Number of vowels = "+j);
	}
}