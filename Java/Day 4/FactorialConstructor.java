class fact
{
	int n;
	public
		fact(int n1)
		{
			n=n1;
		}
		void Fact()
		{
			int i=0,f=1;
			for(i=1;i<=n;i++)
			{
				f=f*i;
			}
			System.out.print("Factorial="+f);
		}
}
public class FactorialConstructor
{
	public static void main(String args[])
	{
		fact a1=new fact(3);
		a1.Fact();
	}
}