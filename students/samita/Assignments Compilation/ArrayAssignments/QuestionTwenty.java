package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//20) Program to print the elements of an array in reverse order
public class QuestionTwenty {

	// Method to reverse the array
	public static int[] reverseArray(int[] arr) {
		int j = 0;
		int[] temp = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; --i) {
			temp[j] = arr[i];
			j++;
		}

		for (int i = 0; i < arr.length; ++i) {
			arr[i] = temp[i];
		}
		return arr;
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
		System.out.println("Question No 20: ");
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
		System.out.print("\nReversed Array: ");
		displayArray(reverseArray(arr));
		sc.close();

	}

}
