import java.io.DataInputStream;
public class Combine
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0;
		int a[]=new int[5];int b[]=new int[5];int c[]=new int[10];
		try 
		{
			for(i=0;i<5;i++)
			{
				System.out.print("Enter a number for 'a' array : ");
				a[i]=Integer.parseInt(in.readLine());
			}
			for(i=0;i<5;i++)
			{
				System.out.print("Enter a number for 'b' array : ");
				b[i]=Integer.parseInt(in.readLine());
			}
		} catch (Exception e) {}
		for(i=0;i<5;i++)
		{
			c[i]=a[i];
		}
		for(j=0;j<5;j++)
		{
			c[i+j]=b[j];
		}
		System.out.println();
		for(i=0;i<10;i++)
		System.out.print("\n"+c[i]);;
	}

}