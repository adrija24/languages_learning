import java.util.Scanner;
public class percentageCalculator {
	public static void main(String[] args) {
		System.out.println("Percentage Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full marks of exam: ");
		int fullMarks = sc.nextInt();
		System.out.print("Enter marks of 1st subject: ");
		int a = sc.nextInt();
		System.out.print("Enter marks of 2nd subject: ");
		int b = sc.nextInt();
		System.out.print("Enter marks of 3rd subject: ");
		int c = sc.nextInt();
		System.out.print("Enter marks of 4th subject: ");
		int d = sc.nextInt();
		System.out.print("Enter marks of 5th subject: ");
		int e = sc.nextInt();
		int total = a+b+c+d+e;
		float percentage = (total*100)/fullMarks;
		System.out.print("The percentage of the student will be: "+percentage);
	}
}