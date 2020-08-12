import java.io.DataInputStream;
public class Multiplication
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0,k=0;
		int a[][]=new int[3][4];int b[][]=new int[4][3];int c[][]=new int[3][3];
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
			for(i=0;i<4;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print("Enter a number for 'b' matrix : ");
					b[i][j]=Integer.parseInt(in.readLine());
				}
			}
			System.out.print("\nMatrix 'b' will be like :\n");
			for(i=0;i<4;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print("\t"+b[i][j]);
				}
				System.out.print("\n");
			}
		} 
		catch (Exception e) {}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=0;
				for(k=0;k<4;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.print("\nThe answer will be like :\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+c[i][j]);
			}
			System.out.print("\n");
		}
	}

}
