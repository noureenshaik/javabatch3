import java.util.Scanner;

public class Exercise14Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int i;
		int count = 0;
		for (i = 1; i <= num; ++i) {
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println("The given number: " + num + " is a prime number.");
		else
			System.out.println("The given number: " + num + " is not a prime number");
	}

}
