class box
{
	int length;
	int breadth;
	box(int x, int y)
	{
		length = x;
		breadth = y;
	}
	int area()
	{
		return(length*breadth);
	}
}
class cuboid extends box
{
	int height;
	cuboid(int x, int y, int z)
	{
		super(x,y);
		height=z;
	}
	int volume()
	{
		return (length*breadth*height);
	}
}

public class SingleInheritance
{
	public static void main(String args[])
	{
		cuboid box1 = new cuboid(5, 6, 7);
		int area1 = box1.area();
		int volume1 = box1.volume();
		System.out.print("Area = "+area1);
		System.out.print("\nVolume = "+volume1);
	}
}