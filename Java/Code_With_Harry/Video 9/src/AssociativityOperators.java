
public class AssociativityOperators {

	public static void main(String[] args) {
//		Precedence & Associativity
//		 Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity

		int a = 6*5-34/2;
		int b = 60/5-34*2;
		System.out.println(a);
		/*
		 
		 =30-34/2
		 =30-17
		 =13
		 
		 */
		System.out.println(b);
		/*
		 
		 =12-34*2
		 =12-68
		 =-56
		 
		 */
		
	}

}
