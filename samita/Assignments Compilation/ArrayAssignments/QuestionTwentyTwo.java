package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//22) Program to print the elements of an array present on odd position
public class QuestionTwentyTwo {
	// Method to find the odd positioned elements
	// In this program, I have used position not the index
	public static void oddPosition(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			if ((i + 1) % 2 != 0) {
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
		System.out.println("Question No 22: ");
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
		System.out.println("\n=============================================");
		System.out.print("Elements Present on odd position of the Array: ");
		System.out.println("\n=============================================");
		System.out.println("\nElement\t  Position");
		oddPosition(arr);
		sc.close();

	}

}
