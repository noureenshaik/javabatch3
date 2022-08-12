package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

/*13) Write a Java program to separate even and odd numbers of a
*given array of integers. Put all even numbers first, and then odd
numbers. */

public class QuestionThirteen {
	// Method to separate odd and even and store
	// all even at first and then odd
	public static int[] oddEven(int[] arr) {
		int[] temp= new int[arr.length];
		int count = 0;
		// For even
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] % 2 == 0) {
				temp[count] = arr[i];
				count++;
			}

		}
		// For odd
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] % 2 != 0) {
				temp[count] = arr[i];
				count++;
			}

		}
		return temp;
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
		System.out.println("Question No 13: ");
		System.out.println("--------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int n = sc.nextInt();

		while (n <= 1) {
			System.out.println("Please enter the size of an array greater than 1");
			n = sc.nextInt();
		}

		int[] arr = new int[n];
		System.out.println("Enter the elements of an Array: \n");
		for (int i = 0; i < n; ++i) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\nOriginal Array: ");
		displayArray(arr);
		System.out.print("\nArranged Array: ");
		displayArray(oddEven(arr));

		sc.close();

	}

}
