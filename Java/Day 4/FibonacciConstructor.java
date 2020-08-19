class fibonacci
{
	int a,b,c;
	public
	fibonacci(int a1,int b1,int c1)
		{
			a=a1;
			b=b1;
			c=c1;
		}
		void Fibonacci()
		{
			int i=0,n=0;
			System.out.print(a+" "+b);
			for(i=3;i<=n;i++)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
		}
}
public class FibonacciConstructor
{
	public static void main(String args[])
	{
		fibonacci a1=new fibonacci(1,3,5);
		a1.Fibonacci();
	}
}