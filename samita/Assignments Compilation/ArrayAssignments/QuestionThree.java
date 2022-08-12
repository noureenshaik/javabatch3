package com.personal.bootcamp.arrayassignment;

//3) Write a Java program to find the index of an array element
import java.util.Scanner;

public class QuestionThree {
	// Method to check return the index of the passed value
	public static int findIndex(int[] arr, int n) {
		for (int i = 0; i < arr.length; ++i) {
			if (n == arr[i]) {
				return i;

			}
		}
		//returns -1 if element is not found in the array
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question No 3: ");
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
		System.out.print("\nEnter the value you want to find the index of: ");
		int value = sc.nextInt();
		System.out.print("\n===============================");
		int index = findIndex(arr, value);
		
		//If -1 is returned, that means no such element is present in array
		//So, handling for the same.
		if (index == -1) {
			System.out.println("\nNumber " + value + " is not found in given array!!");
		} else {
			//returns index only if found
			System.out.println("\nNumber " + value + " is found at index " + index);
		}
		System.out.print("===============================");
		sc.close();
	}

}
