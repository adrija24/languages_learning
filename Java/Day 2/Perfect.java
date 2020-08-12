import java.io.*;
public class Perfect
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int n=0,s=0,f=1,i=1;
		try 
		{
			System.out.print("Enter a number : ");
			n=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		while(i<n)
		{
			if(n%i==0)
			{
				s=s+i;
				f=f*i;
			}
			i++;
		}
		if(s==f)
			System.out.print("It is a perfect number");
		else
			System.out.print("It is not a perfect number");
	}

}
