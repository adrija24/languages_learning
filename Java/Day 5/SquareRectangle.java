class Box2D
{
	int l,b;
	public
		Box2D(int l1)
		{
			l=b=l1;
		}
		Box2D(int l1,int b1)
		{
			l=l1;
			b=b1;
		}
	int Area()
	{
		return(l*b);
	}
}
class SquareRectangle
{
	public static void main(String[] args) {
		Box2D b1 = new Box2D(11);
		Box2D b2 = new Box2D(5,6);
		int a1=b1.Area();
		int a2=b2.Area();
		System.out.print("Area of square="+a1+"\n"+"Area of rectangle="+a2);
	}
}
