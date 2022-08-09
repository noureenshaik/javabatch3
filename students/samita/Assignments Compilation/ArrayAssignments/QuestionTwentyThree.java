package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//23) Program to print the sum of all the elements of an array
public class QuestionTwentyThree {
	// Method to calculate sum elements
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			sum += arr[i];
		}
		return sum;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question No 23: ");
		System.out.println("--------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of an Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of an Array: \n");
		for (int i = 0; i < n; ++i) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\nOriginal Array: ");
		displayArray(arr);
		System.out.print("Sum of Given Array: " + sumOfArray(arr));

		sc.close();

	}
}
