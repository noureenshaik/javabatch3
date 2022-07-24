//Question no 6
/*
 * Write a program to accept gender ("Male" or "Female") 
 * and age (1-120) from command line arguments and print 
 * the percentage of interest based on the given conditions. 
 * Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6%
 *  Gender ==> Female Age ==>59 -120 Interest == 9.2% 
 *  Gender ==> Male Age ==>1-60 Interest == 8.3% Gender ==> Male Age ==>61-120
 */
package FlowControlAssignment;

import java.util.Scanner;

public class MaleOrFemale 
{

	public static void main(String[] args)
	{
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter gender: Male or Female");
		String gender = console.nextLine();
		
		System.out.println("Enter age: ");
		int age = console.nextInt();
		
		if(!(age > 120))
		{
			if(gender.equals("female") && (age >1) && (age <=58) )
			{
				System.out.println("Your interest is 8.2%");
			}
			else if(gender.equals("female") && (age >=59) && (age <=120) )
			{
				System.out.println("Your interest is 7.6%");
			}
			else if(gender.equals("male") && (age >=1) && (age <=58) )
			{
				System.out.println("Your interest is 9.2%");
			}
			else if(gender.equals("male") && (age >=59) && (age <=120) )
			{
				System.out.println("Your interest is 8.3%");
			}
			else
			{
				System.out.println("wrong input");
			}
			//break;
		}
		else
		{
			System.out.println("age cannot be greater than 120");
		}
		
	}
}
