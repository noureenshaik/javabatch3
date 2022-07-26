import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num==1 || num==2) {
			System.out.println("Number is Prime");
			System.exit(0);
		}
		
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				System.out.println("Number is not Prime");
				break;
			}
			if (i==num-1)
			System.out.println("Number is Prime");
		}
		
	}

}
