import java.io.DataInputStream;

public class Leap
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int y=0,b=0;
		try 
		{
			System.out.print("Enter the year : ");
			y=Integer.parseInt(in.readLine());
		} 
		catch (Exception e) {}
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
					System.out.println("It is a Leap Year");
				else 
					System.out.println("It is not a Leap Year");
			}
			else 
			{
				System.out.println("It is a Leap Year");
			}
		}
		else
			System.out.println("It is not a Leap Year");
	}
}

