package com.personal.bootcamp.arrayassignment;
//5) Write a Java program to find the maximum and minimum value of an

// array

import java.util.Scanner;

public class QuestionFive {
	// Method to find the maximum value of array
	public static int maxNum(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; ++i) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// method to find the minimum value of array
	public static int minNum(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; ++i) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	// Method to display the array in formatted fashion
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
		System.out.println("Question No 5: ");
		System.out.println("--------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println();
		for (int i = 0; i < n; ++i) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.print("\n==================================================\n");
		System.out.print("Original Array: ");
		displayArray(arr);

		System.out.print("\nMaximum and Minimum values in an array: ");
		System.out.println("\nMaximum: " + maxNum(arr) + "\nMinimum: " + minNum(arr));
		System.out.print("======================================================");
		sc.close();

	}

}
