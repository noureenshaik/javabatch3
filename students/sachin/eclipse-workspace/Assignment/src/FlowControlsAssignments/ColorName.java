package FlowControlsAssignments;

import java.util.Scanner;

public class ColorName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Enter the code-------------");
		System.out.println("R");
		System.out.println("B");
		System.out.println("G");
		System.out.println("O");
		System.out.println("Y");
		System.out.println("W");
		System.out.println("--------------------------------------");
		
		char c = sc.next().charAt(0);
		
		switch (c) {
		case 'R':
			System.out.println(c+" -> Red");
			break;
			
		case 'B':
			System.out.println(c+" -> Blue");
			break;
			
		case 'G':
			System.out.println(c+" -> Green");
			break;
		
		case 'O':
			System.out.println(c+" -> Orange");
			break;
		
		case 'Y':
			System.out.println(c+" -> Yellow");
			break;
	
		case 'W':
			System.out.println(c+" -> White");
			break;
			
		default:
			System.out.println("Invalid Entry!");
		}
	}

}
