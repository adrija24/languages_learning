
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
		int fact()
		{
			int i=0,f=1;
			for(i=1;i<=n;i++)
			{
				f=f*i;
			}
			return f;
		}
		
}
class FactorialReturn
{
	public static void main(String args[]) 
	{
		Fact p1=new Fact();
		p1.getdata();
		int y=p1.fact();
		System.out.print("Factorial = "+y);
	}
}
