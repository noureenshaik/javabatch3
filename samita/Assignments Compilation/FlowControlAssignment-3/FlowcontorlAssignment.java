

import java.util.Scanner;

public class FlowcontorlAssignment {

	/*
	 * @author Samita Shrestha
	 * JDBC-3, Takeo
	 * This assignment contains the compilation of questions from 
	 * flowcontrol Assignment, I have used separate methods for each to perform the 
	 * task asked in each question .
	 */
		static Scanner sc = new Scanner(System.in);

		// Extra Functions used to display the answer in same format
		public static void display(int fNo, int sNo) {

			System.out.println("\tFirst No: " + fNo);
			System.out.println("\tSecond No: " + sNo);
		}

		// Overloading the method for displaying three numbers
		public static void display(int fNo, int sNo, int tNo) {

			System.out.println("\tFirst No: " + fNo);
			System.out.println("\tSecond No: " + sNo);
			System.out.println("\tThird No: " + tNo);
		}

		// Question 1 a.
		// A method to swap two numbers Using Temp variable and with out temp
		public static void swapTwoWithoutTemp(int fNo, int sNo) {

			System.out.println("\nWithout Temp");
			System.out.println("===============");
			System.out.println("\nBefore Swapping: ");
			display(fNo, sNo);
			
			fNo = fNo + sNo;
			sNo = fNo - sNo;
			fNo = fNo - sNo;
			
			System.out.println("\nAfter Swapping: ");
			display(fNo, sNo);

		}

		// Question 1 b..
		// Method to swap two numbers Using Temp Varible
		public static void swapTwoWithTemp(int fNo, int sNo) {
			System.out.println("\nWith temp");
			System.out.println("=============");
			System.out.println("\nBefore Swapping: ");
			display(fNo, sNo);
			
			int temp = 0;
			temp = fNo;
			fNo = sNo;
			sNo = temp;
			
			System.out.println("\nAfter Swapping: ");
			display(fNo, sNo);

		}

		// Question 2 a.
		// method to swap three numbers Using Temp Varible and with out temp
		public static void swapThreeWithoutTemp(int fNo, int sNo, int tNo) {
			
			System.out.println("\nWithout temp");
			System.out.println("===============");
			System.out.println("\nBefore Swapping: ");
			display(fNo, sNo, tNo);
			
			fNo = fNo + sNo + tNo;
			sNo = fNo - sNo - tNo;
			tNo = fNo - sNo - tNo;
			fNo = fNo - sNo - tNo;
			
			System.out.println("\nAfter Swapping: ");

			display(fNo, sNo, tNo);

		}

		// Question 2 b.
		// method to swap three numbers Using Temp Varible and with out temp
		public static void swapThreeWithTemp(int fNo, int sNo, int tNo) {
			
			System.out.println("\nWith temp");
			System.out.println("==============");

			System.out.println("\nBefore Swapping: ");
			display(fNo, sNo, tNo);

			int temp;
			temp = fNo;
			fNo = sNo;
			sNo = tNo;
			tNo = temp;

			System.out.println("\nAfter Swapping: ");
			display(fNo, sNo, tNo);

		}

		// Question 3 and 4
		// a method to check given number is even number or not.
		public static void isEvenOrOdd(int num) {

			if (num % 2 == 0)
				System.out.println("->  "+num + " is Even.");
			else
				System.out.println("->  "+num + " is Odd.");

		}
	    
		// Question 5
		// method to check given number is prime number or not.
		public static void isPrime(int num) {

			int count = 0;
			if (num == 0)
				System.out.println("->  "+num + " is not Prime.");
			else if (num == 1)
				System.out.println("->  "+num + " is neither Prime nor Composite.");
			else {
				for (int i = 2; i < num; ++i) {
					if (num % i == 0)
						count++;
				}

				if (count == 0)
					System.out.println("->  "+num + " is Prime.");
				else
					System.out.println("->  "+num + " is not Prime.");
			}

		}
		
		// Question 6
		// a method to print the factorial of the given number
		public static void factorial(int num) {
			
			int fact = 1;
			for (int i = num; i >= 1; --i) {
				fact *= i;
			}
			System.out.println("->  Factorial of " + num + " is " + fact + ".");
			
		}
		
		// Question 7
		// method to check given number is Armstrong number or not.
		public static void isArmstrong(int num) {
			
			int sum = 0;
			int originalNum = num;

			while (num != 0) {
				int rem = num % 10;
				sum += rem * rem * rem;
				num /= 10;
			}

			if (originalNum == sum)
				System.out.println("->  "+originalNum + " is an Armstrong number.");
			else
				System.out.println("->  "+originalNum + " is not an Armstrong number.");

		}

		// Question 8
		// a method to check given number is Palindrome number or not.
		public static void isPalindrome(int num) {
			
			int originalNum = num;
			int sum = 0;
			while (num != 0) {
				int rem = num % 10;
				sum = sum * 10 + rem;
				num /= 10;
			}

			if (originalNum == sum)
				System.out.println("->  "+originalNum + " is a Palindrome number.");
			else
				System.out.println("->  "+originalNum + " is not a Palindrome number.");
			
		}

		// Question 9
		// a method to display 1 to 100 between prime numbers
		public static void primeNumbers() {
			
			// From Question
			int num = 100;
			System.out.println("The Prime numbers between 1 to 100 are: ");
			System.out.print("->  [ ");
			for (int i = 2; i <= num; ++i) {
				int count = 0;
				for (int j = 2; j < i; ++j) {
					if (i % j == 0)
						count++;

				}
				if (count == 0)
					System.out.print(i + " ");

			}
			System.out.print("]");
		}

		// Question 10
		// method to display 1 to 100 between even numbers
		public static void evenNumbers() {
			
			// From Question
			int num = 100;
			System.out.println("The even numbers between 1 to 100 are: ");

			System.out.print("->  [ ");
			for (int i = 1; i <= num; ++i) {
				if (i % 2 == 0)
					System.out.print(i + " ");
			}
			System.out.print("]");
		}

		// Main method
		public static void main(String[] args) {

			// Question No.1
			System.out.println("Question 1:");
			System.out.println("----------\n");
			System.out.print("Enter First Number: ");
			int fNo = sc.nextInt();

			System.out.print("Enter Second Number: ");
			int sNo = sc.nextInt();

			swapTwoWithoutTemp(fNo, sNo);
			swapTwoWithTemp(fNo, sNo);

			// Question No.2
			System.out.println("\nQuestion 2: Three Number Swapping");
			System.out.println("-----------------------------------\n");
			System.out.print("First Number: " );
			fNo = sc.nextInt();
			System.out.print("Second Number: " );
			sNo = sc.nextInt();
			System.out.print("Third Number: ");
			int tNo = sc.nextInt();
			
			swapThreeWithoutTemp(fNo, sNo, tNo);
			swapThreeWithTemp(fNo, sNo, tNo);

			// Question No. 3 and 4
			System.out.println("\nQuestion 3 and 4:");
			System.out.println("--------------------\n");
			System.out.print("Enter the number to check for (even or odd): ");
			int num = sc.nextInt();

			isEvenOrOdd(num);

			// Question No.5
			System.out.println("\nQuestion 5:");
			System.out.println("----------\n");
			System.out.print("Enter the number to check for Prime or not: ");
			num = sc.nextInt();

			isPrime(num);

			// Question No.6
			System.out.println("\nQuestion 6:");
			System.out.println("----------\n");
			System.out.print("Enter the number to print the factorial of : ");
			num = sc.nextInt();

			factorial(num);

			// Question No.7
			System.out.println("\nQuestion 7:");
			System.out.println("----------\n");
			System.out.print("Enter the number to check for Armstrong Number: ");
			num = sc.nextInt();

			isArmstrong(num);

			// Question No.8
			System.out.println("\nQuestion 8:");
			System.out.println("----------\n");
			System.out.print("Enter the number to check for Palindrome Number: ");
			num = sc.nextInt();

			isPalindrome(num);

			// Question No.9
			System.out.println("\nQuestion 9:");
			System.out.println("----------\n");

			primeNumbers();

			// Question No.10
			System.out.println("\n\nQuestion 10:");
			System.out.println("------------\n");

			evenNumbers();

		}

	}


