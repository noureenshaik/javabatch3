package FlowControlAssignment;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		
		Scanner dev = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int num = dev.nextInt();
		
		
	
	if( num > 0)
	{
		System.out.println(" Positive Number ");
		
	}
	else if ( num < 0)
	{
		
		System.out.println(" Negative Number ");
	}
	else
	{
		
		System.out.println(" Zero Number ");
		
	}
		
		

	}

}
