package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//18) Program to copy all the elements of one array into another array
public class QuestionEighteen {

	// Method to copy elements of array 1 to array 2
	public static void copyArray(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; ++i) {
			arr2[i] = arr1[i];
		}
		System.out.println("\nAfter Copying: ");
		System.out.println("==============");
		System.out.print("Array 1: ");
		displayArray(arr1);
		System.out.print("Array 2: ");
		displayArray(arr2);

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
		System.out.println("Question No 18: ");
		System.out.println("--------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of first Array: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the elements of Array 1: ");
		for (int i = 0; i < n; ++i) {
			arr1[i] = sc.nextInt();
		}

		System.out.print("Enter the size of second Array where you want to copy and store elements of Array 1: ");
		int n2 = sc.nextInt();
		while (n2 < n) {
			System.out.println("[Size of the second array should be greater than or equal to first array ]");
			n2 = sc.nextInt();
		}
		int[] arr2 = new int[n2];
		System.out.println("Before copying: ");
		System.out.println("==============");
		System.out.print("Array 1: ");
		displayArray(arr1);
		System.out.print("Array 2: ");
		displayArray(arr2);

		copyArray(arr1, arr2);

		sc.close();

	}

}
