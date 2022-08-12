package com.personal.bootcamp.arrayassignment;

//27) Swap three array with temp variable
import java.util.Scanner;

public class QuestionTwentySeven {
	// Method to swap three arrays using temp
	public static void swapArray(int[] arr1, int[] arr2, int[] arr3) {

		int[] temp = new int[arr1.length];
		for (int i = 0; i < arr1.length; ++i) {
			temp[i] = arr1[i];
			arr1[i] = arr3[i];
			arr3[i] = arr2[i];
			arr2[i] = temp[i];
		}

		System.out.println("\nAfter Swapping: ");
		System.out.println("===============");
		System.out.print("Array 1: ");
		displayArray(arr1);
		System.out.print("Array 2: ");
		displayArray(arr2);
		System.out.print("Array 3: ");
		displayArray(arr3);
	}

	// Method to display in array format
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
		System.out.println("Question No 27: ");
		System.out.println("--------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n = sc.nextInt();
		while (n <= 1) {
			System.out.println("Please enter the size of an array greater than 1");
			n = sc.nextInt();
		}
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		for (int i = 1; i <= 3; ++i) {

			System.out.println("\nEnter the elements of an Array " + i + ": \n");
			for (int j = 0; j < n; ++j) {
				if (i == 1) {
					System.out.print("Element " + (j + 1) + ": ");
					arr1[j] = sc.nextInt();
				} else if (i == 2) {
					System.out.print("Element " + (j + 1) + ": ");
					arr2[j] = sc.nextInt();
				} else {
					System.out.print("Element " + (j + 1) + ": ");
					arr3[j] = sc.nextInt();
				}

			}
		}
		System.out.println("\nOriginal Array: ");
		System.out.println("=================");
		System.out.print("Array 1: ");
		displayArray(arr1);

		System.out.print("Array 2: ");
		displayArray(arr2);
		System.out.print("Array 3: ");
		displayArray(arr3);
		swapArray(arr1, arr2, arr3);
		sc.close();

	}

}
