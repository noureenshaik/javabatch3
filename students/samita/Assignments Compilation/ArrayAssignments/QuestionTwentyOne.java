package com.personal.bootcamp.arrayassignment;
//21) Program to print the elements of an array present on even

//position

import java.util.Scanner;

public class QuestionTwentyOne {

	// Method to find the even positioned elements
	// In this program, I have used position not the index
	public static void evenPosition(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			if ((i + 1) % 2 == 0) {
				System.out.println("  " + arr[i] + "\t    " + (i + 1));
			}
		}
	}

	// Method to display array in formatted fashion
	public static void displayArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
			if (i != (arr.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question No 21: ");
		System.out.println("--------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of an Array: \n");
		for (int i = 0; i < n; ++i) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\nOriginal Array: ");
		displayArray(arr);
		System.out.print("\nElements Present on Even position of the Array: ");
		System.out.println("\nElement\t  Position");
		evenPosition(arr);
		sc.close();

	}
}
