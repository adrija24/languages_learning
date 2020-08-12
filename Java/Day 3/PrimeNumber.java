
import java.io.DataInputStream;
class Prime
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
		void prime()
		{
			int i=0,flag=0;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					flag=1;
			}
			if(flag==0)
				System.out.print("It is a prime number");
			else
			{
				System.out.print("It is not a prime number");
			}
		}
		
}
class PrimeNumber
{
	public static void main(String args[]) 
	{
		Prime p1=new Prime();
		p1.getdata();
		p1.prime();
		
	}
}
