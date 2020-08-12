import java.io.DataInputStream;
public class MaxMin
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,max=0,min=0;
		int a[]=new int[5];
		try 
		{
			for(i=0;i<5;i++)
			{
				System.out.print("Enter a number : ");
				a[i]=Integer.parseInt(in.readLine());
			}
		} catch (Exception e) {}
		max=a[0];
		min=a[0];
		for(i=0;i<5;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.print("Max number : "+max);
		System.out.print("\nMin number : "+min);
	}

}
