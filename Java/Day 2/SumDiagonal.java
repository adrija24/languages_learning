import java.io.DataInputStream;
public class SumDiagonal
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0,s=0;
		int a[][]=new int[3][3];
		try 
		{
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print("Enter a number for 'a' matrix : ");
					a[i][j]=Integer.parseInt(in.readLine());
				}
			}
			System.out.print("\nMatrix 'a' will be like :\n");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.print("\n");
			}
		} 
		catch (Exception e) {}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j)
					s=s+a[i][j];
			}
		}
		System.out.print("\nSummation = "+s);
	}

}
