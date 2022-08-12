package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//14) Write a Java program to find the k largest elements in a given
//    array. Elements in the array can be in any order
public class QuestionFourteen {
	// Method to sort the elements of given array
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

	// method to get k largest element from a sorted array
	public static void kLargest(int arr[], int k) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}

		}
		temp[j++] = arr[arr.length - 1];

		if (j < 2) {
			System.out.println("All Elements are same");

		} else if (k > j) {
			// For example: if non duplicated array has size of 5 and k=6, it
			// will return invalid because we cannot return the values greater
			// than
			// size of an array
			System.out.println("Invalid value of k");
		} else {

			System.out.print(k + " largest elements of given array are ");
			System.out.print("[ ");
			for (int i = 0; i < k; ++i) {
				System.out.print(temp[j - i - 1] + " ");

			}
			System.out.println("]");
		}

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
		System.out.println("Question No 14: ");
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
		System.out.print("Enter how many largest element, you'd like to display: ");
		int k = sc.nextInt();
		System.out.print("\nOriginal Array: ");
		displayArray(arr);

		kLargest(sortedArray(arr), k);

		sc.close();

	}

}
