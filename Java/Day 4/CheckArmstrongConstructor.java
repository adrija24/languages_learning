class checkArmstrong
{
	int n;
	public
	checkArmstrong(int n1)
		{
			n=n1;
		}
		void CheckArmstrong()
		{
			int m=0,s=0,temp=0;
			temp=n;
			while(n!=0)
			{
				m=n%10;
				n=n/10;
				s=s+m*m*m;
			}
			if(s==temp)
				System.out.print("It is an Armstrong number");
			else
			{
				System.out.print("It is not an Armstrong number");
			}
		}
}
public class CheckArmstrongConstructor
{
	public static void main(String args[])
	{
		checkArmstrong a1=new checkArmstrong(154);
		a1.CheckArmstrong();
	}
}