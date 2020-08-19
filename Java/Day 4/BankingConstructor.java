class bank
{
	int balance,credit,debit;
	public
		bank(int balance1,int credit1, int debit1)
		{
			balance=balance1;
			credit=credit1;
			debit=debit1;
		}
		int Bank()
		{
			int total=balance+credit-debit;
			return total;
		}
}
public class BankingConstructor 
{
	public static void main(String args[]) 
	{
		bank a1=new bank(10000, 3000, 5000);
		int t=a1.Bank();
		System.out.print("Total balance="+t);
	}
}
