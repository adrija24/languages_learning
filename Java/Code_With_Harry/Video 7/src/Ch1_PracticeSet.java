import java.util.Scanner;

public class Ch1_PracticeSet {

	public static void main(String[] args) {
		// Question 1
		int a = 10;
		int b = 10;
		int c = 15;
		int sum = a+b+c;
		System.out.println("Sum of the three numbers : "+sum);
		
		// Question 2
		float sub1 = 45;
		float sub2 = 58;
		float sub3 = 68;
		float cgpa = (sub1+sub2+sub3)/30;
		System.out.println("The CGPA of the student is : "+cgpa);
		
		// Question 3
		System.out.print("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello " + name + "!!! Have a Good Day...");
		
		// Question 4
		System.out.print("Enter distance in kilometer : ");
		Scanner scanner = new Scanner(System.in);
		double km = scanner.nextDouble();
		double mile = km*0.621371;
		System.out.println("The distance in mile will be : " + mile);
		
		// Question 5
		System.out.print("Enter your number : ");
		Scanner sc1 = new Scanner(System.in);
		System.out.println(sc1.hasNextInt());
	}

}
