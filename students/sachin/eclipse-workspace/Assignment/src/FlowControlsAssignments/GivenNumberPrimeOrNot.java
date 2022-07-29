package FlowControlsAssignments;

import java.util.Scanner;

public class GivenNumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean flag=true;
		for (int i=2;i<=n/2;i++) {
			if (n%i==0) {
				System.out.println(n + " is not a Prime Number");
				flag = false;
				break;
			}
		}
		
		if (n==1 || n==0)
			System.out.println(n+" is neither prime nor composite");
		else if (flag==true)
			System.out.println(n+" is a Prime Number");

	}

}
