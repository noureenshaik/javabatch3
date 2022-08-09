package FlowControlsAssignments;

import java.util.Scanner;

public class ChangeCaseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);
		char b;
		if (c >= 65 && c <= 90) {
			b = (char) (97 + (c - 65));
			System.out.println(c + " -> " + b);
		} else if (c >= 97 && c <= 122) {
			b = (char) (65 + (c - 97));
			System.out.println(c + " -> " + b);
		} else
			System.out.println("Invalid Entry!");
	}

}
