package com.personal.bootcamp.flowcontrol;
/*8)Write a program to print the color name, based on color code. If color code in not valid 
then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
				[Switch Statement] 	
*/
import java.util.Scanner;

public class ColorCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\nChoose from the color code below: \n");
			System.out.println("\t===================");
			System.out.println("\t  R------RED");
			System.out.println("\t  G------GREEN");
			System.out.println("\t  B------BLUE");
			System.out.println("\t  W------WHITE");
			System.out.println("\t  Y------YELLOW");
			System.out.println("\t  K------BLACK");
			System.out.println("\t  P------PINK");
			System.out.println("\n\t[Press E to exit ]");
			System.out.println("\t====================");

		
			char choice=Character.toUpperCase( sc.next().charAt(0));
			
			System.out.println("You entered: " + choice);
			System.out.println("--------------------------------");
			switch (choice) {
			case 'R':
				System.out.println("\t    RED");
				System.out.println("--------------------------------");
				break;
			case 'G':
				System.out.println("\t    GREEN");
				System.out.println("--------------------------------");
				break;
			case 'B':
				System.out.println("\t    BLUE");
				System.out.println("--------------------------------");
				break;
			case 'W':
				System.out.println("\t    WHITE");
				System.out.println("--------------------------------");
				break;
			case 'Y':
				System.out.println("\t    YELLOW");
				System.out.println("--------------------------------");
				break;
			case 'K':
				System.out.println("\t    BLACK");
				System.out.println("--------------------------------");
				break;
			case 'P':
				System.out.println("\t    PINK");
				System.out.println("--------------------------------");
				break;
			case 'E':
				System.out.println("Thanks for playing color code!");
				System.out.println("\tSee you soon!!");
				System.out.println("--------------------------------");
				System.exit(0);
			default:
				System.err.println("Invalid Code!!!");
				System.out.println("Please select one from the menu:");
				System.out.println("--------------------------------");

			}
		
		}
	

	}
	

}
