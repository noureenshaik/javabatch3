package FlowControlsAssignments;

import java.util.Scanner;

public class SumofAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.print(num);
		int sum=0;
		while(num>0) {
			int digit =num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println(" -> " + sum);
	}

}
