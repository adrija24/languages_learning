class Add
{
	int a,b;
	public
		void getdata(int a1,int b1)
		{
			a=a1;
			b=b1;
		}
	void dispaly()
	{
		int c=a+b;
		System.out.print("Sum = "+c);
	}
}
public class AddClassObject 
{
	public static void main(String args[])
	{
		Add a1=new Add();
		a1.getdata(10, 20);
		a1.dispaly();
	}
}
