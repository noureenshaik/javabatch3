package com.personal.bootcamp.arrayassignment;

//8) Write a Java program to find the duplicate values of an array of
// string values
import java.util.Scanner;

public class QuestionEight {
	// Method to find the duplicate strings
	public static void duplicateElements(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			// For every duplicate words, it is set to "  ", so that it
			// will be ignored when found again
			if(arr[i]=="  ")
				continue;
			String element = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (element.equals(arr[j])) {
					count++;
					arr[j] = "  ";
				}
			}
			if (count > 1)
				System.out.print(element + " ");
		}
	}

	// Method to display the array in formatted fashion
	public static void displayArray(String[] arr) {
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
		System.out.println("Question No 8: ");
		System.out.println("--------------\n");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of an array: ");
		int n = sc.nextInt();
		String[] arr = new String[n];

		System.out.println();
		for (int i = 0; i < n; ++i) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.next();
		}

		System.out.print("\n==================================================\n");
		System.out.print("Original Array: ");
		displayArray(arr);

		System.out.println("\nDuplicate elements of a given array are: ");
		System.out.println("======================================================");
		System.out.print("==>   ");
		duplicateElements(arr);

		System.out.println("\n======================================================");
		sc.close();

	}

}
