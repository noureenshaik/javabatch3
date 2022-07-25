package assignment3;

import java.util.*;
//to check if the user input character is alphabet, number or digit
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character: ");
		char ch = sc.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("Alphabet");
		else if (ch >= '0' && ch <= '9')
			System.out.println("Digit");
		else
			System.out.println("Special character");
		sc.close();

	}

}
