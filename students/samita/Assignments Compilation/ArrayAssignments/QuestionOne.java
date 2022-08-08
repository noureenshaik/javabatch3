package com.personal.bootcamp.arrayassignment;

//1) Write a Java program to calculate the average value of array
import java.util.Scanner;

public class QuestionOne {
	// Method to calculate average of elements
	public static double averageValue(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			sum += arr[i];
		}
		double average = ((double) sum / (arr.length));
		return average;

	}

	// Main Method
	public static void main(String[] args) {
		System.out.println("Question No 1: ");
		System.out.println("--------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\n==================================");
		System.out.println("\nThe average value is " + averageValue(arr));
		System.out.print("==================================");
		sc.close();
	}

}
