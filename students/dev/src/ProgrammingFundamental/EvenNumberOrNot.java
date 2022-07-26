package ProgrammingFundamental;

import java.util.Scanner;

public class EvenNumberOrNot {

	public static void main(String[] args) {
		
		Scanner dev = new Scanner(System.in);
		System.out.println(" enter the number ");
		int number = dev.nextInt();
		
		
		if( number % 2 == 0)
			
		{
			
			System.out.println(" Even number ");
		}
		else
		{
			
			System.out.println(" Not Even Number");
		}
		
		

	}

}
