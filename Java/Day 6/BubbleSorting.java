public class BubbleSorting 
{
	static String name[]= {"Madras","Delhi","Kolkata","Mumbai","Chennai"};
	public static void main(String args[]) 
	{
		int size=name.length;
		String temp=" ";
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(name[j].compareTo(name[i])<0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(name[i]);
		}
	}
}
