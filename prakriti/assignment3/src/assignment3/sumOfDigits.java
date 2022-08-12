package assignment3;

import java.util.Scanner;

public class sumOfDigits {
	  void sum() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int sno = sc.nextInt();
			int sum=0;
          
      for(int i=1;i<=sno;i++)
      {
    	  int remainder= sno%10;
    	  sum+=remainder;
    	  sno=sno/10;
    	  
      }
				System.out.println("The sum of all the digits of the given number is: "+sum);
			sc.close();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			sumOfDigits eo = new sumOfDigits();
			eo.sum();

		}
	}
