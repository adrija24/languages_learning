class checkPerfect
{
	int n;
	public
	checkPerfect(int n1)
		{
			n=n1;
		}
		void CheckPerfect()
		{
			int i=0,s=0,f=1;
			for(i=1;i<n;i++)
			{
				if(n%i==0)
				{
					s=s+i;
					f=f*i;				
				}
			}
			if(f==s)
				System.out.print("It is a Perfect number");
			else
			{
				System.out.print("It is not a Perfect number");
			}
		}
}
public class CheckPerfectConstructor
{
	public static void main(String args[])
	{
		checkPerfect a1=new checkPerfect(6);
		a1.CheckPerfect();
	}
}