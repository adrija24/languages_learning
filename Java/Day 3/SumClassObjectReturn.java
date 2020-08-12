
import java.io.*;
class Add
{
	DataInputStream in=new DataInputStream(System.in);
	int a,b;
	public
		void getdata()
		{
			try
			{
				System.out.print("Enter number 'a' : ");
				a=Integer.parseInt(in.readLine());
				System.out.print("Enter number 'b' : ");
				b=Integer.parseInt(in.readLine());
			} 
			catch (Exception e) {}
		}
		int display()
		{
			int c=a+b;
			return c;
		}
	}
	class SumClassObjectReturn 
	{
	public static void main(String args[])
	{
		Add c1=new Add();
		c1.getdata();
		c1.display();
		int x=c1.display();
		System.out.print("Sum = "+x);
	}
}
