package assignment2;

import java.util.Scanner;

public class palindrome {
	void isPalindrome() {
		int remainder=0, temp;
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int sno = sc.nextInt();
		temp = sno;
		while (temp > 0) {
			remainder = temp % 10;
			reverse=(reverse*10)+remainder;
			temp = temp / 10;
		}
		if (sno==reverse) {
			System.out.println("The given number is palidrome.");
		} else {
			System.out.println("The given number is not palindrome.");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome eo = new palindrome();
		eo.isPalindrome();

	}
}
