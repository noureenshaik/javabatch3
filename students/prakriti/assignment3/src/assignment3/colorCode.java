package assignment3;

import java.util.Scanner;

public class colorCode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Choose a color code between A-Z :");
		
		switch(str){
	case "R":
		System.out.println("Red");
		break;
	case "B":
		System.out.println("Blue");
		break;
	case "Y":
		System.out.println("Yellow");
		break;
	case "G":
		System.out.println("Green");
	case "O":
		System.out.println("Orange");
	case "W":
		System.out.println("White");
	case "P":
		System.out.println("Pink");
		break;
	case "V":
		System.out.println("Violet");
		break;
	case "M":
		System.out.println("Maroon");
		break;
	case "S":
		System.out.println("Silver");
		break;
	case "C":
		System.out.println("Cream");
		break;
	case "L":
		System.out.println("Lavender");
		break;
		default:		
			System.out.println("Invalid code.");
	}
		sc.close();
	}

}