class sum
{
	int a,b;
	public
		sum(int a1,int b1)
		{
			a=a1;
			b=b1;
		}
		void Sum()
		{
			int c=a+b;
			System.out.print("Sum="+c);
		}
}
public class SumConstructor
{
	public static void main(String args[])
	{
		sum a1=new sum(10, 20);
		a1.Sum();
	}
}
