import java.io.*;
import java.util.*;

public class ItemCodeCostRead
{
	static DataInputStream dis=new DataInputStream(System.in);
	static StringTokenizer st;
	public static void main(Striinventng args[]) throws IOException
	{
		DataInputStream dis=new DataInputStream(new FileInputStream("invent.txt"));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("invent.txt"));
		System.out.println("Eneter code number ");
		st=new StringTokenizer(dis.readLine());
		int code=Integer.parseInt(st.nextToken());
		System.out.println("Enter number of items : ");
		st=new StringTokenizer(dis.readLine());
		int items=Integer.parseInt(st.nextToken());
		System.out.println("Enter cost : ");
		st=new StringTokenizer(dis.readLine());
		double cost = new Double(st.nextToken()).doubleValue();
		dos.writeInt(code);
		dos.writeInt(items);
		dos.writeDouble(cost);
		dos.close();
		int codeNumber = dis.readInt();
		int totalItems = dis.readInt();
		double itemCost = dis.readDouble();
		double totalCost = totalItems*itemCost;
		dis.close();
		System.out.println("Code Number : "+codeNumber);
		System.out.println("Item Cost : "+itemCost);
		System.out.println("Total Items : "+totalItems);
		System.out.println("Total cost : "+totalCost);
	}
}
