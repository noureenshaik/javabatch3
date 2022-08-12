package com.personal.bootcamp.flowcontrol;
/*13) Write a program to print prime numbers between 10 and 99.
 * 						[For Loop] 	
 */

public class PrimeNumbersBetween {

	public static void isPrime(int start, int end) {
		for (int i = start; i <= end; ++i) {
			int count = 0;
			for (int j = 1; j <= i; ++j) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNum = 10;
		int endNum = 99;

		isPrime(startNum, endNum);

	}

}
