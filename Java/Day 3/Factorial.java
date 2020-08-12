
import java.io.DataInputStream;
class Fact
{
	DataInputStream in=new DataInputStream(System.in);
	int n;
	public
		void getdata()
		{
			try 
			{
				System.out.print("Enter the number : ");
				n=Integer.parseInt(in.readLine());
			}
			catch (Exception e) {}
		}
		void fact()
		{
			int i=0,f=1;
			for(i=1;i<=n;i++)
			{
				f=f*i;
			}
			System.out.print("Factorial = "+f);
		}
		
}
class Factorial
{
	public static void main(String args[]) 
	{
		Fact p1=new Fact();
		p1.getdata();
		p1.fact();
		
	}
}
