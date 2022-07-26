import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		boolean isPrime=true;
		int num = sc.nextInt();
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				isPrime=false;
				break;
			}
			if (i==(num-1))
			System.out.println("Prime Number");
		}
		if (isPrime==false)
		System.out.println("Not a Prime Number");
	}

}
