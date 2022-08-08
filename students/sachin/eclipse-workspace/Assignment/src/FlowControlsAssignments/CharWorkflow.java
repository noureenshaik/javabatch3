package FlowControlsAssignments;

import java.util.Scanner;

public class CharWorkflow {

	public static void main(String[] args) {
		/* Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s
		a number then print "Digit" and for other characters print "Special Character"*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		
		if (c>=48 && c<=57)
			System.out.println("Entered character is a number");
		
		else if ((c>=65 && c<=90) || (c>=97 && c<=122))
				System.out.println("Entered character is an alphabet");
		
		else
			System.out.println("Enter character is a special character");
			
	}

}
