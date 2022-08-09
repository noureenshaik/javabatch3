package FlowControlsAssignments;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.println("Given number is Positive");
		else if (num < 0)
			System.out.println("Given number is negative");
		else
			System.out.println("You entered 0");

	}

}
