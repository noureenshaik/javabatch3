package FlowControlsAssignments;

import java.util.Scanner;

public class InterestRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Gender Male or Female: ");
		String gender = sc.next();
		
		System.out.println("Enter your Age between 1 and 120");
		int age = sc.nextInt();
		
		if (gender.equalsIgnoreCase("Female") && (age >=1 && age<=58))
			System.out.println("Your Interest is 8.2%");
		
		else if (gender.equalsIgnoreCase("Female") && (age >=59 && age<=120))
			System.out.println("Your Interest is 7.6%");
		
		else if (gender.equalsIgnoreCase("Male") && (age >=1 && age<=60))
			System.out.println("Your Interest is 9.2%");
		
		else if (gender.equalsIgnoreCase("Male") && (age >=61 && age<=120))
			System.out.println("Your Interest is 8.3%");
		
		else
			System.out.println("Wrong Entry. Terminating Program");
	}

}
