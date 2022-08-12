package assignment3;

import java.util.Scanner;

public class PosNegZero {
	 void isPosNegZero(){
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int sno=sc.nextInt();

			if(sno<0)

			    System.out.println("The given number is negative.");
			else if(sno>0)
			    System.out.println("The given number is positive.");
			else
				System.out.println("The given number is zero.");
				
			sc.close();
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PosNegZero eo= new PosNegZero();
			eo.isPosNegZero();

			    }
		}

