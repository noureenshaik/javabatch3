package com.personal.bootcamp.flowcontrol;
/*11) Write a program to print even numbers between 23 and 57, each 
 *    number should be printed in a separate row.[For Loop]
 */

public class EvenNumbers {

	public static void evenNum(int start, int end) {
		for (int i = start; i <= end; ++i) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNum = 23;
		int endNum = 57;
		evenNum(startNum, endNum);
	}
}
