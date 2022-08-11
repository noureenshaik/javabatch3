package FlowControlsAssignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("What Operation would you like to do?");
			System.out.println("1. ADD");
			System.out.println("2. SUBTRACT");
			int choice = sc.nextInt();
			
			switch(choice){
			case 1:
				add(sc);
				break;
				
			case 2:
				sub(sc);
				break;
			
			default:
				System.out.println("Invalid Entry!");
			}
			
			System.out.println("Do you want to Continue?");
			c = sc.next().charAt(0);
		}while (c=='y' || c=='Y');
	}
	static void add(Scanner sc) {
		System.out.println("Enter 1st Number : ");
		int n1=sc.nextInt();
		System.out.println("Enter 1st Number : ");
		int n2=sc.nextInt();
		System.out.println("Addition of "+n1+ " and "+n2+" = "+ (n1+n2));
	}
	
	static void sub(Scanner sc) {
		System.out.println("Enter 1st Number : ");
		int n1=sc.nextInt();
		System.out.println("Enter 1st Number : ");
		int n2=sc.nextInt();
		System.out.println("Subtration of "+n1+ " and "+n2+" = "+ (n1-n2));
	}
}
