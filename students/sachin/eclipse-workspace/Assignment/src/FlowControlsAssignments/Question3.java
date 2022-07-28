package FlowControlsAssignments;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Write a program to check if the program has received command line arguments
		 * or not. If the program has not received the values then print "No Values",
		 * else print all the values in a single line separated by ,(comma). Eg1) java
		 * Example O/P: No values Eg2) java Example Mumbai Bangalore O/P:
		 * Mumbai,Bangalore [Note: You can use length property of an array to check its
		 * length
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter anything you want : ");

		String s = sc.nextLine();

		if (s.length() == 0)
			System.out.println("Nothing was entered");
		else {
			for (int i = 0; i <= s.length() - 1; i++) {
				if (s.charAt(i) == ' ' && i != s.length() - 1)
					System.out.print(",");
				else
					System.out.print(s.charAt(i));
			}
		}

	}

}
