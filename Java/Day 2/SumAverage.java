import java.io.DataInputStream;

public class SumAverage {

	public static void main(String[] args)
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,s=0;
		float av=0.0f;
		int a[]=new int[5];
		try 
		{
			for(i=0;i<5;i++)
			{
				System.out.print("Enter a number : ");
				a[i]=Integer.parseInt(in.readLine());
			}
		} catch (Exception e){}
		for(i=0;i<5;i++)
			s=s+a[i];
		av=(float)s/5;
		System.out.print("Sum="+s+"\t"+"Average="+av);	
	}

}
