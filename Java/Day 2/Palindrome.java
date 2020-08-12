import java.io.DataInputStream;

public class Palindrome {

	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int n=0,m=0,s=0,temp=0;
		try 
		{
			System.out.print("Enter a number : ");
			n=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		temp=n;
		while(n!=0)
		{
			m=n%10;
			n=n/10;
			s=s*10+m;
		}
		if(s==temp)
			System.out.print("It is a palindromic sequence");
		else
			System.out.print("It is not a palindromic sequence");
	}

}
