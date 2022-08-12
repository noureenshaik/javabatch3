import java.util.Scanner;

public class isOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if (num % 2 != 0) {
			System.out.println("The given number " + num + " is an odd number.");
		} else
			System.out.println("The given number " + num + " is not an odd number.");
	}

}
