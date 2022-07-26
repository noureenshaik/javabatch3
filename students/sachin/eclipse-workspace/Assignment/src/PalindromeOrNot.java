import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int power = power(n);

		int i = calculate(n, power);

		if (i == n)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palidrome");
	}

	public static int power(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		//System.out.println("The power we want to use is : "+count);
		return count;
	}

	public static int calculate(int n, int power) {
		int i = 0;
		while (n > 0) {
			i+= (n % 10) * (int) Math.pow(10, --power);
			n = n / 10;
		}
		return i;
	}
}
