package assignment3;

import java.util.Scanner;

public class calculator {
	static Scanner sc = new Scanner(System.in);
	int num1, num2;

	public void userInput() {
		System.out.println(" enter the first number: ");
		num1 = sc.nextInt();
		System.out.println(" enter the second number: ");
		num2 = sc.nextInt();
	}

	public void ADD() {
		userInput();
		int sum = num1 + num2;
		System.out.println(" Sum of the number is: " + sum);
	}

	public void SUB() {
		userInput();
		int diff;
		if (num1 > num2) {
			diff = num1 - num2;
			System.out.println(" The diff between two number is: " + diff);
		} else {
			diff = num2 - num1;
			System.out.println(" The diff between two number is: " + diff);

		}

	}

	public void MUL() {
		userInput();
		int product = num1 * num2;
		System.out.println(" product of two number:  " + product);
	}

	public static void main(String[] args) {

		calculator eo = new calculator();
		String str;
		do {
			System.out.println(" ************************Choose the options below************** ");
			System.out.println("          1) ADD ");
			System.out.println("          2) SUB ");
			System.out.println("          3) MUL ");
			System.out.println("          4) EXIT ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				eo.ADD();
				break;
			case 2:
				eo.SUB();
				break;
			case 3:
				eo.MUL();
				break;
			case 4:
				System.out.println(" Exiting");
				System.exit(0);

			default:
				System.out.println(" enter the choice between 1-4 ");

			}
			System.out.println("Do you want to continue? press y or Y to continue:");
			str = sc.next();
		} while (str.equals("y") || str.equals("Y"));

	}
}