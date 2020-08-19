class prime
{
	int n;
	public
		prime(int n1)
		{
			n=n1;
		}
		void Prime1()
		{
			int i=0,flag=0;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					flag=1;
			}
			if(flag==0)
			{
				System.out.print("It is a prime number");
			}
			else
			{
				System.out.print("It is not a prime number");
			}
		}
}
public class CheckPrime
{
	public static void main(String args[])
	{
		prime a1=new prime(12);
		a1.Prime1();
	}
}

