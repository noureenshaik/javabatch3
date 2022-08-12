package assignment2;

import java.util.*;

public class factorial {
	void fac() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int sno = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <=sno; i++) {
			fact=fact*i;	
		}
		System.out.println("factorial of "+sno+" is: "+fact);

		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial eo = new factorial();
		eo.fac();

	}
}
