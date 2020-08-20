interface Area
{
	final static float pi = (float)22/7;
	float compute(float x, float y);
}
class Rectangle implements Area
{
	public float compute(float x, float y)
	{
		return (x*y);
	}
}
class Circle implements Area
{
	public float compute(float x, float y)
	{
		return (pi*x*x);
	}
}
public class InterfaceTest 
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		Area area;
		area = rect;
		System.out.print("Area of the rectangle : "+area.compute(10, 20));
		area = cir;
		System.out.print("\nArea of the circle : "+area.compute(10, 0));
	}
}
