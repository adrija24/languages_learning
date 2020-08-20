class TwoDimension
{
	int length;
	int breadth;
	TwoDimension(int a, int b)
	{
		length = a;
		breadth = b;
	}
	int area()
	{
		return(length*breadth);
	}
}
class ThreeDimension extends TwoDimension
{
	int height;
	ThreeDimension(int a, int b, int c)
	{
		super(a,b);
		height = c;
	}
	int volume()
	{
		return(length*breadth*height);
	}
}
class FourthDimension extends ThreeDimension
{
	int time;
	FourthDimension(int a, int b, int c, int d)
	{
		super(a,b,c);
		time = d;
	}
	int TimeMachine()
	{
		return(length*breadth*height*time);
	}
}

public class MultilevelInheritance
{
	public static void main(String args[])
	{
		FourthDimension answer= new FourthDimension(5, 7, 8, 6);
		int area1 = answer.area();
		int volume1 = answer.volume();
		int timemachine1 = answer.TimeMachine();
		System.out.print("Area = "+area1);
		System.out.print("\nVolume = "+volume1);
		System.out.print("\nTime Machine calculated = "+timemachine1);
	}
}