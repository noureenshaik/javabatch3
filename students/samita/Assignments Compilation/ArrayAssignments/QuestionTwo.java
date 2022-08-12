package com.personal.bootcamp.arrayassignment;

//2) Write a Java program to test if an array contains a specific value
import java.util.Scanner;

public class QuestionTwo {

	// Method to check if the given value is contained or not in an array
	public static String valueFound(int[] arr, int n) {
		for (int i = 0; i < arr.length; ++i) {
			if (n == arr[i]) {
				return "contains";
			}
		}
		return "donot contain";
	}

	// Main Method
	public static void main(String[] args) {
		System.out.println("Question No 2: ");
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
		System.out.print("\nEnter the value you want to find in the array: ");
		int value = sc.nextInt();
		System.out.print("\n===============================");
		System.out.println("\nArray " + valueFound(arr, value) + " number " + value);
		System.out.print("===============================");
		sc.close();
	}

}
