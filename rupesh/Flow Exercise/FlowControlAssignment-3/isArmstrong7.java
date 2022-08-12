import java.util.Scanner;

//Armstrong means sum of cubes of its digits is equal to the number itself.

public class isArmstrong7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int originalNum = num;
		int c = num % 10;
		num = num - c;
		num = num / 10;
		int b = num % 10;
		num = num - b;
		num = num / 10;
		int a = num;
		if (originalNum == (a * a * a) + (b * b * b) + (c * c * c)) {
			System.out.println("The number " + originalNum + " is an Armstrong.");
		} else
			System.out.println("The number " + originalNum + " is not an Armstrong.");
	}

}
