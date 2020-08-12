
import java.io.DataInputStream;
public class Transpose
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0;
		int a[][]=new int[3][4];int b[][]=new int[4][3];
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
		catch (Exception e) {}
		for(i=0;i<4;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.print("\nThe transposed matrix will be like :\n");
		for(i=0;i<4;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			System.out.print("\n");
		}
	}

}
