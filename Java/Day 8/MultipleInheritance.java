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
class B
{
	int num3;
	int num4;
	B(int c, int d)
	{
		num3 = c;
		num4 = d;
	}
	int subtraction()
	{
		return(num3-num4);
	}
}
class C
{
	int num5;
	int num6;
	C(int e, int f)
	{
		num5 = e;
		num6 = f;
	}
	int multiplication()
	{
		return(num5*num6);
	}
}
class D
{
	int num7;
	int num8;
	D(int g, int h)
	{
		num7 = g;
		num8 = h;
	}
	int multiplication()
	{
		return(num7/num8);
	}
}
class Total extends A,B,C,D
{
	int num9;
	Total(int a, int b, int c, int d, int e, int f, int g, int h, int i)
	{
		super(a, b, c, d, e, f, g, h);
		num9 = i;
	}
	int multiplication()
	{
		return((num1+num2)+(num3-num4)+(num5*num6)+(num7/num8)+num9);
	}
}

public class MultipleInheritance
{
	public static void main(String args[])
	{
		Total answer= new Total(2, 3, 7, 5, 8, 6, 18, 6);
		int sum1 = answer.sum();
		int subtraction1 = answer.subtraction();
		int multiplication1 = answer.multiplication();
		int division1 = answer.division();
		int total1 = answer.division();
		System.out.print("Sum = "+sum1);
		System.out.print("\nSubtraction = "+subtraction1);
		System.out.print("\nMultiplication = "+multiplication1);
		System.out.print("\nDivision = "+division1);
		System.out.print("\ntotal = "+total1);
	}
}
