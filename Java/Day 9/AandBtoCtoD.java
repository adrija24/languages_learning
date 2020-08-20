interface A
{
	int a = 0;
	int b = 0;
}

interface B
{
	int c = 0;
	int d = 0;
}

interface C extends A,B
{
	int e = 0;
	int f = 0;
}


class D implements C
{
	D(int a, int b, int c, int d, int e, int f)
	{
		int x = 105;
		int sub = ((a*b)+(c*d)+(e*f))-x;
		System.out.print("Final result : "+sub);
	}
}
public class AandBtoCtoD
{
	public static void main(String args[])
	{
		D ans =new D(5, 12, 14, 9, 10, 20);
	}
}

