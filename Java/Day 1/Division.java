import java.io.*;
public class Division
{
	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0;
		try
		{
			System.out.print("Enter the marks : ");
			a=Integer.parseInt(in.readLine());
		} catch (Exception e) {}
		if (a>60)
		{
			System.out.print("1st Division");
		}
		else
		{
			if (a>50)
			{
				System.out.print("2nd Division");
			}
			else 
			{
				if (a>40)
				{
					System.out.print("3rd Division");
				}
				else 
				{
					System.out.print("Failed");
				}
			}
		}
	}
}

