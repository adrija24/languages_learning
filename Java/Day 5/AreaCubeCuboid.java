class Box3D
{
	int l,b,h;
	public
		Box3D(int l1)
		{
			l=b=h=l1;
		}
		Box3D(int l1,int h1)
		{
			l=b=l1;
			h=h1;
		}
	int Area()
	{
		return(2*((l*l)+(l*h)+(l*h)));
	}
}
class AreaCubeCuboid
{
	public static void main(String[] args) {
		Box3D b1 = new Box3D(5);
		Box3D b2 = new Box3D(5,8);
		int a1=b1.Area();
		int a2=b2.Area();
		System.out.print("Area of cube="+a1+"\n"+"Area of cuboid="+a2);
	}
}