package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//7) Write a Java program to find the duplicate values of an array of
//   integer values
public class QuestionSeven {
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

	public static void duplicateElements(int[] arr) {
		int count = 1;
		// This loop checks the frequency of occurence of each number
		// For a sorted array, the duplicate elements are placed consecutive
		// count variable is used to count the frequency of occurence
		// Also, whenever a new number comes, the counter is reset to 1
		// if count>1 means number occurs more than 1 times, (duplicate)
		// then prints such elements in the array
		for (int i = 0; i < arr.length - 1; ++i) {

			if (arr[i] != arr[i + 1]) {
				// enters this statements for every new element is accessed.
				if (count > 1) {
					// only prints if it is duplicate element
					System.out.print("  " + arr[i]);
				}
				// For every new element, counter is reset
				count = 1;
			} else {
				// For every duplicate elements counter is incremented
				count++;
			}
		}

		if (count > 1)
			System.out.print("  " + arr[arr.length - 1]);

	}

	// Method to diplay in array format
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
		System.out.println("Question No 7: ");
		System.out.println("--------------\n");
		// TODO Auto-generated method stub
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

		System.out.print("\nDuplicate elements of a given array are: ");
		duplicateElements(sortedArray(arr));

		System.out.print("\n======================================================");
		sc.close();
	}

}
