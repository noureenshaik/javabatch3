import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
	
		int num = sc.nextInt();
		int fact = num;
		
		for(int i =(num-1);i>1;i--) {
			fact = fact*i;
			
			}

		System.out.println("factorial value of "+ num +" is :  "+fact);
		}

	}

