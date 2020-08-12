
import java.io.DataInputStream;
public class AddMatrix
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0;
		int a[][]=new int[3][4];int b[][]=new int[3][4];int c[][]=new int[3][4];
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
			for(i=0;i<3;i++)
			{
				for(j=0;j<4;j++)
				{
					System.out.print("Enter a number for 'b' matrix : ");
					b[i][j]=Integer.parseInt(in.readLine());
				}
			}
			System.out.print("\nMatrix 'b' will be like :\n");
			for(i=0;i<3;i++)
			{
				for(j=0;j<4;j++)
				{
					System.out.print("\t"+b[i][j]);
				}
				System.out.print("\n");
			}
		} 
		catch (Exception e) {}
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.print("\nThe answer will be like :\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print("\t"+c[i][j]);
			}
			System.out.print("\n");
		}
	}

}
