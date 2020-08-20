interface A
{
	int a = 0;
	int b = 0;
}


interface D
{
	int c = 0;
	int d = 0;
}
interface E extends D
{
	int e = 0;
	int f = 0;
}


class B implements A,E
{

	public B(int a, int b, int c, int d, int e,int f)
	{
		int x = 10;
		int sum = (a*b)+(c*d)+(e*f)+x;
		System.out.print("Summation result : "+sum);
	}
}


class C extends B
{
	C(int a, int b, int c, int d, int e, int f)
	{
		super(a,b,c,d,e,f);
		int y = 55;
		int sub = (a*b)+(c*d)+(e*f)-y;
		System.out.print("\nSubtraction result : "+sub);
	}
}
public class DtoEtoB_AtoB_BtoC
{
	public static void main(String args[])
	{
		C ans = new C(8, 12, 5, 8, 12, 9);
	}
}
