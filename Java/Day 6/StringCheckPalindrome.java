import java.io.DataInputStream;

public class StringCheckPalindrome
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		String s1="",s2="";
		int i=0;
		try 
		{
			System.out.print("Enter the string : ");
			s1=in.readLine();
		} 
		catch (Exception e) {}
		for(i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.compareTo(s2)==0)
			System.out.print("It is a palindromic sequence");
		else
		{
			System.out.print("It is not a palindromic sequence");
		}
	}
}