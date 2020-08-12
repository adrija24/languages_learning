
import java.io.DataInputStream;
class Perfect
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
		void perfect()
		{
			int i=1,s=0,f=1;
			for(i=1;i<n;i++)
			{
				if(n%i==0)
				{
					s=s+i;
					f=f*i;
				}
			}
			if(f==s)
				System.out.print("It is a perfect number");
			else 
			{
				System.out.print("It is not a perfect number");
			}
		}
		
}
class PerfectCheck
{
	public static void main(String args[]) 
	{
		Perfect p1=new Perfect();
		p1.getdata();
		p1.perfect();
		
	}
}
