package com.personal.bootcamp.arrayassignment;

//4) Write a Java program to remove a specific element from an array
import java.util.Scanner;

public class QuestionFour {
	// Keeps track of size of temp
	static int count = 0;

	// Method to display array in the formatted fashion
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

	// Method to check if value is found and remove the specific value
	// from array.
	public static void valueFound(int[] arr, int n) {
		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; ++i) {
			if (n != arr[i]) {

				temp[count] = arr[i];
				count++;
			}

		}
		// Passing count as the length of temp so as to eliminate
		// unnecessary zeros at the end of array
		displayArray(temp, count);

	}

	// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question No 4: ");
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
		System.out.print("\nEnter the value you want to remove in the array: ");
		int value = sc.nextInt();
		System.out.print("\n==================================================\n");
		System.out.print("Original Array: ");
		displayArray(arr, arr.length);
		System.out.print("\nElement to remove: " + value);

		System.out.print("\nFinal Array after removing the element:");
		valueFound(arr, value);
		System.out.print("======================================================");
		sc.close();
	}

}
