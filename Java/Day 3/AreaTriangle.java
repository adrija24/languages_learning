
import java.io.DataInputStream;


class Triangle {
	DataInputStream in=new DataInputStream(System.in);
	int a, b, c;
	public void getdata() 
	{
		try 
		{
			System.out.print("Enter arm 'a' : ");
			a=Integer.parseInt(in.readLine());
			System.out.print("Enter arm 'b' : ");
			b=Integer.parseInt(in.readLine());
			System.out.print("Enter arm 'c' : ");
			c=Integer.parseInt(in.readLine());
			in.close();
		}
		catch (Exception e) {}
	}
	double area() 
	{
		float s=(a+b+c)/2;
		double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ar;
	}
}
class AreaTriangle 
{
	public static void main(String args[]) 
	{
		Triangle p1=new Triangle();
		p1.getdata();
		double y=p1.area();
		System.out.print("\nArea = " + y);
	}
}
