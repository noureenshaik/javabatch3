package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//12) Write a Java program to find the second smallest element in an
//    array
public class QuestionTwelve {
	// method to sort the array
	// Bubble sort algorithm is used
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

	// method to get the second smallest element from sorted non duplicated
	// array
	public static void secondSmallest(int arr[]) {
		int[] temp = new int[arr.length];
		int j = 0;
		// Extracting the unique elements (non duplicate) for accurate result
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}

		}
		temp[j++] = arr[arr.length - 1];

		if (j < 2) {
			System.out.println("All Elements are same");

		} else
			// Since 1 is the index of second smallest element
			System.out.print("Second smallest element of array: " + temp[1]);

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

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question No 12: ");
		System.out.println("--------------\n");
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
		secondSmallest(sortedArray(arr));

		sc.close();

	}

}
