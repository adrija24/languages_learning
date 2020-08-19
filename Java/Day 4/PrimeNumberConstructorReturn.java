class primereturn
{
	int n;
	public
		primereturn(int n1)
		{
			n=n1;
		}
		int Prime()
		{
			int i=0,flag=0;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					flag=1;
			}
			if(flag==0)
				return 1;
			else
			{
				return 0;
				
			}
		}
}
public class PrimeNumberConstructorReturn
{
	public static void main(String args[])
	{
		primereturn a1=new primereturn(12);
		int yes=a1.Prime();
		if(yes==1)
		System.out.print("It is a prime number");
		else 
		{
			System.out.print("It is not a prime number");
		}
	}
}