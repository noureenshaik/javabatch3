package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

public class QuestionEleven {
	// Method to sort an array
	public static int[] sortedArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	// Method to find the second largest element from sorted non duplicated
	// array
	public static void secondLast(int arr[]) {
		int[] temp = new int[arr.length];
		int j = 0;
		// To remove duplicate for the accuracy
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}

		}
		temp[j++] = arr[arr.length - 1];
		// if statements below returns the second largest element on the basis
		// of size of the sorted non duplicated array
		if (j < 2) {
			System.out.println("All Elements are same");

		} else
			System.out.print("Second largest element of array: " + temp[j - 2]);

	}

	// method to display array in format
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

	// main method
	public static void main(String[] args) {
		System.out.println("Question No 11: ");
		System.out.println("--------------\n");
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of an Array: ");
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
		secondLast(sortedArray(arr));

		sc.close();

	}

}
