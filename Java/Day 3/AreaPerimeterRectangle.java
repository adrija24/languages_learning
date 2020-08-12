
import java.io.DataInputStream;
class Rectangle
{
	DataInputStream in=new DataInputStream(System.in);
	int a,b;
	public
		void getdata()
		{
			try 
			{
				System.out.print("Enter the length of the rectangle : ");
				a=Integer.parseInt(in.readLine());
				System.out.print("Enter the breadth of the rectangle : ");
				b=Integer.parseInt(in.readLine());
			}
			catch (Exception e) {}
		}
		int perimeter()
		{
			int p=2*(a+b);
			return p;
		}
		int area()
		{
			int ar=a*b;
			return ar;
		}
		
}
class AreaPerimeterRectangle
{
	public static void main(String args[]) 
	{
		Rectangle p1=new Rectangle();
		p1.getdata();
		int x=p1.perimeter();
		int y=p1.area();
		System.out.print("\nArea = "+y+"\n"+"Perimeter = "+x);
	}
}