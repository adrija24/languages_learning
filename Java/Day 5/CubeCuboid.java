class Box3D
{
	int l,b,h;
	public
		Box3D(int l1)
		{
			l=b=h=l1;
		}
		Box3D(int l1,int b1,int h1)
		{
			l=l1;
			b=b1;
			h=h1;
		}
	int Area()
	{
		return(l*b*h);
	}
}
class CubeCuboid
{
	public static void main(String[] args) {
		Box3D b1 = new Box3D(5);
		Box3D b2 = new Box3D(5,6,8);
		int a1=b1.Area();
		int a2=b2.Area();
		System.out.print("Volume of cube="+a1+"\n"+"Volume of cuboid="+a2);
	}
}
