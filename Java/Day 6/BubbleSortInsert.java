import java.io.DataInputStream;

public class BubbleSortInsert
{
	public static void main(String args[]) 
	{
		DataInputStream in=new DataInputStream(System.in);
		String name[]=new String[4];
		String temp=" ";
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.print("Enter the string : ");
				name[i]=in.readLine();
			}
		}
		catch (Exception e) {}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(name[j].compareTo(name[i])<0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(name[i]);
		}
	}
}
