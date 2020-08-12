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
		void dispaly()
		{
			int c=a+b;
			System.out.print("Sum = "+c);
		}
	}
	class AddInputClassObject 
	{
	public static void main(String args[])
	{
		Add a1=new Add();
		a1.getdata();
		a1.dispaly();
	}
}
