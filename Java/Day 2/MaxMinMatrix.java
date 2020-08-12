
import java.io.DataInputStream;
public class MaxMinMatrix
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,j=0,max=0,min=0;
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
		max=a[0][0];
		min=a[0][0];
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
				if(a[i][j]<min)
					min=a[i][j];
			}
		}
		System.out.print("\nMaximum number : "+max+"\nMinimum number : "+min);
	}
}
