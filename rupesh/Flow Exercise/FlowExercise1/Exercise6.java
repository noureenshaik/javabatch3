import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you gender: Male or Female");
		String gender = sc.next().toLowerCase();
		System.out.println("Enter your age: 1-120");
		int age = sc.nextInt();
		if (gender.equals("female") && (age >= 1 && age <= 58))
			System.out.println("Your interest rate is 8.2%.");
		else if (gender.equals("female") && (age >= 59 && age <= 120))
			System.out.println("Your interest rate is 7.6%.");
		else if (gender.equals("male") && (age >= 1 && age <= 60))
			System.out.println("Your interest rate is 9.2%.");
		else if (gender.equals("male") && (age >= 61 && age <= 120))
			System.out.println("Your interest rate is 8.3%.");
		else
			System.out.println("Input Error:");
//			System.out.println("Please enter the age between 1-120 only.");
//			System.out.println("Please fully type the gender.");
	}

}
