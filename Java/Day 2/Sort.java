import java.io.DataInputStream;
public class Sort
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0,temp=0;
		int a[]=new int[5];
		try 
		{
			for(i=0;i<5;i++)
			{
				System.out.print("Enter a number : ");
				a[i]=Integer.parseInt(in.readLine());
			}
		} catch (Exception e) {}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("After sorting -");
		for(i=0;i<5;i++)
		System.out.print("\n"+a[i]);;
	}

}
