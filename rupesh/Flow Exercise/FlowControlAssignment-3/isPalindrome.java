import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = sc.nextInt();
		int reverse = 0;
		int originalNum = num;
		while (num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;

		}
		System.out.println("The reverse of the number " + originalNum + " is " + reverse + ".");
		if (originalNum == reverse)
			System.out.println("Thus,the number: " + originalNum + " is a palindrome.");
		else
			System.out.println("Thus, the number: " + originalNum + " is not a palindrome.");
	}

}
