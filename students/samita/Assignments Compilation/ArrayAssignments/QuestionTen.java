package com.personal.bootcamp.arrayassignment;
//10) Write a Java program to remove duplicate elements from an array

import java.util.Scanner;

public class QuestionTen {
	// Method to sort the array
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

	// Method to remove duplicate array
	public static void duplicateArray(int arr[]) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}

		}
		temp[j++] = arr[arr.length - 1];
		displayArray(temp, j);

	}

	// Method to print array in formatted fashion
	public static void displayArray(int[] arr, int length) {
		System.out.print("[");
		for (int i = 0; i < length; ++i) {
			System.out.print(arr[i]);
			if (i != (length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		System.out.println("Question No 10: ");
		System.out.println("--------------\n");
		// TODO Auto-generated method stub

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
		displayArray(arr, arr.length);
		System.out.print("New Array elements after removing duplication: ");

		duplicateArray(sortedArray(arr));
		sc.close();

	}
}
