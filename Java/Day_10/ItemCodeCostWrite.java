import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class ItemCodeCostWrite 
{
	static DataInputStream din = new DataInputStream(System.in);
	static StringTokenizer st;
	
	public static void main(String args[]) throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("invent.txt"));
		
		System.out.print("Enter code number : ");
		st = new StringTokenizer(din.readLine());
		int code = Integer.parseInt(st.nextToken());
		
		System.out.print("Enter number of items : ");
		st = new StringTokenizer(din.readLine());
		int items = Integer.parseInt(st.nextToken());
		
		System.out.print("Enter cost : ");
		st = new StringTokenizer(din.readLine());
		double cost = new Double(st.nextToken()).doubleValue();
		
		dos.writeInt(code);
		dos.writeInt(items);
		dos.writeDouble(cost);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("invent.txt"));
		int codeNumber = dis.readInt();
		int totalItems = dis.readInt();
		double itemCost = dis.readDouble();
		double totalCost = totalItems*itemCost;
		dis.close();
		
		System.out.println();
		System.out.print("Code Number : "+codeNumber);
		System.out.print("Item Cost : "+itemCost);
		System.out.print("Total Items : "+totalItems);
		System.out.print("Total Cost : "+totalCost);
	}
}
