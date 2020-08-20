interface A
{
	int a = 0;
	int b = 0;
}
class B implements A
{
	int div;
	public B(int a, int b)
	{
		int c = 10;
		int sum = (a*b)+c;
		System.out.print("Summation result : "+sum);
	}
}
class C extends B
{
	C(int a, int b)
	{
		super(a,b);
		int d = 15;
		int sub = ((a*b)-d);
		System.out.print("\nSubtraction result : "+sub);
	}
}
public class AtoBtoC
{
	public static void main(String args[])
	{
		C ans = new C(8, 12);
	}
}

