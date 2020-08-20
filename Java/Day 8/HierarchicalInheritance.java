class A
{
	int num1;
	int num2;
	A(int a, int b)
	{
		num1 = a;
		num2 = b;
	}
	int sum()
	{
		return(num1+num2);
	}
}
class B extends A
{
	int num3;
	int num4;
	B(int a, int b, int c, int d)
	{
		super(a, b);
		num3 = c;
		num4 = d;
	}
	int sumsubtraction()
	{
		return((num1+num2)+(num3-num4));
	}
}
class C extends A
{
	int num5;
	int num6;
	C(int a, int b, int e, int f)
	{
		super(a, b);
		num5 = e;
		num6 = f;
	}
	int summultiplication()
	{
		return((num1+num2)+(num5*num6));
	}
}
class D extends A
{
	int num7;
	int num8;
	D(int a, int b, int g, int h)
	{
		super(a, b);
		num7 = g;
		num8 = h;
	}
	int sumdivision()
	{
		return((num1+num2)+(num7/num8));
	}
}

public class HierarchicalInheritance
{
	public static void main(String args[])
	{
		B ans1 = new B(2, 3, 10, 7);
		C ans2 = new C(2, 3, 7, 8);
		D ans3 = new D(2, 3, 18, 9);
		int answer1=ans1.sumsubtraction();
		int answer2=ans2.summultiplication();
		int answer3=ans3.sumdivision();
		System.out.print("A Method + B Method : "+answer1);
		System.out.print("\nA Method + C Method : "+answer2);
		System.out.print("\nA Method + D Method : "+answer3);
	}
}
