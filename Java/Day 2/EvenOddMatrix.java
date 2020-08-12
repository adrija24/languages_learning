
import java.io.DataInputStream;
public class EvenOddMatrix
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0,e=0,o=0;
		int a[][]=new int[3][4];
		try 
		{
			for(i=0;i<3;i++)
			{
				for(j=0;j<4;j++)
				{
					System.out.print("Enter a number for 'a' matrix : ");
					a[i][j]=Integer.parseInt(in.readLine());
				}
			}
			System.out.print("\nMatrix 'a' will be like :\n");
			for(i=0;i<3;i++)
			{
				for(j=0;j<4;j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.print("\n");
			}
		} 
		catch (Exception x) {}
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				if(a[i][j]%2==0)
					e=e+1;
				else
				{
					o=o+1;
				}
			}
		}
		System.out.print("\nNumber of even numbers : "+e+"\nNumber of odd numbers : "+o);
	}
}

