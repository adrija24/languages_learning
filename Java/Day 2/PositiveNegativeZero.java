import java.io.DataInputStream;
public class PositiveNegativeZero
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,p=0,n=0,z=0;
		int a[]=new int[5];
		try 
		{
			for(i=0;i<5;i++)
			{
				System.out.print("Enter a number for 'a' array : ");
				a[i]=Integer.parseInt(in.readLine());
			}
		} 
		catch (Exception e) {}
		for(i=0;i<5;i++)
		{
			if(a[i]>0)
				p=p+1;
			else
			{
				if(a[i]<0)
					n=n+1;
				else 
				{
					z=z+1;
				}
			}
		}
		System.out.print("Positive numbers : "+p+"\t"+"Negative numbers : "+n+"\t"+"Zeros : "+z);;
	}

}
