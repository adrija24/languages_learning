import java.io.DataInputStream;
import java.lang.*;
public class Armstrong 
{
	public static void main(String[] args) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int n=0,m=0,s=0,temp=0;
		try 
		{
			System.out.print("Enter a number : ");
			n=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		temp=n;
		while(n!=0)
		{
			m=n%10;
			n=n/10;
			s=s+m*m*m;
		}
		if(s==temp)
			System.out.print("It is an Armsrong number");
		else
			System.out.print("It is not an Armsrong number");
	}

}
