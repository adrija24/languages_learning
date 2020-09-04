import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		System.out.println("Taking Input from the User");
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter number 1: ");
////		int a = scanner.nextInt();
//		float a = scanner.nextFloat();
//		System.out.print("Enter number 2: ");
////		int b = scanner.nextInt();
//		float b = scanner.nextFloat();
//		float sum = a+b;
//		System.out.println("The sum of the two numbers is "+sum);
//		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		System.out.println(str);
	}
}