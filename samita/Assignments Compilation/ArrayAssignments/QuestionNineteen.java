package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//19) Program to find the frequency of each element of an array
public class QuestionNineteen {
	// Method to sort the array
	// ALgorithm used: Bubble Sort
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

	// Method to count the frequency of occurrence of element in the sorted
	// array
	public static void frequencyCount(int arr[]) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; ++i) {
			// This if statement checks whether the consecutive elements
			// of the sorted array is same or not, if same, counts the frequency
			// of that element. If not same, updates the counter to one and
			// prints the unique element
			if (arr[i] != arr[i + 1]) {
				System.out.print("  " + arr[i]);
				System.out.print("\t\t  " + count + "\n");
				count = 1;
			} else {
				count++;
			}
		}
		System.out.print("  " + arr[arr.length - 1]);
		System.out.print("\t\t  " + count + "\n");

	}

	// Method to display array in formatted fashion
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

	// Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question No 19: ");
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
		displayArray(arr, arr.length);
		System.out.println("\nFrequency of Elements:");
		System.out.println("======================");
		System.out.println("Elements\tFrequency");

		frequencyCount(sortedArray(arr));
		sc.close();

	}
}
