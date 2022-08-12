package FlowControlAssignment;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		
		Scanner dev = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int num = dev.nextInt();
		
		
		if( num % 2 == 0)
		{
			
			System.out.println(" Even Number ");
		}
		else
		{
			System.out.println(" Odd Number ");
		}
		

	     }

}
