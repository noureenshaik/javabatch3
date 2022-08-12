import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOrNot obj = new EvenOrNot();
		obj.isEven();
	}

		void isEven() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		if (number%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		
		sc.close();
	}

}
