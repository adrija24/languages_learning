
import java.io.DataInputStream;
class Palindrome
{
	DataInputStream in=new DataInputStream(System.in);
	int n;
	public
		void getdata()
		{
			try 
			{
				System.out.print("Enter the number : ");
				n=Integer.parseInt(in.readLine());
			}
			catch (Exception e) {}
		}
		void palindrome()
		{
			int m=0,s=0,temp=0;
			temp=n;
			while(n!=0)
			{
				m=n%10;
				n=n/10;
				s=s*10+m;
			}
			if(temp==s)
				System.out.print("It is a palindromic sequence");
			else 
			{
				System.out.print("It is not a palindromic sequence");
			}
		}
		
}
class PalindromeCheck
{
	public static void main(String args[]) 
	{
		Palindrome p1=new Palindrome();
		p1.getdata();
		p1.palindrome();
		
	}
}

