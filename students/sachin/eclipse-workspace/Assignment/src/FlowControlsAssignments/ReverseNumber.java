package FlowControlsAssignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int copyOfn=n;
		int reverse = 0;
		while (n != 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	
		if(copyOfn == reverse)
			System.out.println(copyOfn + " is a palidrome");
		else
			System.out.println(copyOfn + " is not a palindrome");
	
	}
	

}
