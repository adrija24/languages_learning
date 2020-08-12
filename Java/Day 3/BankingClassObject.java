import java.io.*;
class bank
{
	DataInputStream in=new DataInputStream(System.in);
	int balance,credit,debit;
	public
		void getdata()
		{
			try 
			{
				System.out.print("Enter the present blance : ");
				balance=Integer.parseInt(in.readLine());
				System.out.print("Enter the credited amount : ");
				credit=Integer.parseInt(in.readLine());
				System.out.print("Enter the debited amount : ");
				debit=Integer.parseInt(in.readLine());
			} 
			catch (Exception e) {}
		}
		
		int Bank()
		{
			int total=balance+credit-debit;
			return total;
		}
}
public class BankingClassObject 
{
	public static void main(String args[]) 
	{
		bank a1=new bank();
		a1.getdata();
		int t=a1.Bank();
		System.out.print("Total balance="+t);
	}
}