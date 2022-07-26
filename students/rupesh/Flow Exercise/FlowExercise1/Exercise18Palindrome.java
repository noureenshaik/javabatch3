import java.util.Scanner;

public class Exercise18Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = sc.nextInt();
		int origNum = num;
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
		if (origNum == reverse)
			System.out.println("The given number is a palindrome.");
		else
			System.out.println("The given number is not a palindrome.");
	}

}
