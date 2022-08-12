package com.personal.bootcamp.arrayassignment;

//6) Write a Java program to reverse an array of integer values
import java.util.Scanner;

public class QuestionSix {
	// Method to get reverse of given array
	public static int[] reverseArray(int[] arr) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; --i) {

			temp[j] = arr[i];
			j++;
		}
		return temp;
	}

	// Method to diplay array in formatted fashion
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
		System.out.println("Question No 6: ");
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

		System.out.print("\n==================================================\n");
		System.out.print("Original Array: ");
		displayArray(arr);

		System.out.print("\nReverse of an array: ");

		displayArray(reverseArray(arr));
		System.out.print("======================================================");
		sc.close();

	}

}
