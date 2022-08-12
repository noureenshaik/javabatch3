package FlowControlsAssignments;

import java.util.Scanner;

public class CharComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st character : ");
		char a = sc.next().charAt(0);
		System.out.println("Enter the 2nd Character : ");
		char b =sc.next().charAt(0);
		
		if (a<b) {
			System.out.print(a);
			System.out.print(b);
		}
		else {
			System.out.print(b);
			System.out.print(a);
		}
	}

}
