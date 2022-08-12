package com.personal.bootcamp.arrayassignment;

import java.util.Scanner;

//15) Write a Java program to find the k smallest elements in a given
// array. Elements in the array can be in any order
public class QuestionFifteen {

	//Method to sort the given array
	//Sort Algorithm: Bubble Sort
	public static int[] sortedArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				//For each first element greater than second => swap
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static void kSmallest(int arr[], int k) {
		int[] temp = new int[arr.length];
		int j = 0;
		//To remove all the duplicates of sorted array
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}

		}
		temp[j++] = arr[arr.length - 1];
        //if all entered elements have same value then the size of 
		//non-duplicated array will be 1 For example [1,1,1,1,1,1] will be [1]
		if (j < 2) {
			System.out.println("All Elements are same");

		} else if (k > j) {
			//If the user enters k value more than the size of non duplicated array
			System.out.println("!!Invalid value of k!!");
		} else {
			//Printing out first k elements of sorted non duplicated array
			System.out.print(k + " smallest elements of given array are ");
			System.out.print("[ ");
			for (int i = 0; i < k; ++i) {
				System.out.print(temp[i] + " ");

			}
			System.out.println("]");
		}

	}

	//Method to display all array in a formatted fashion
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question No 15: ");
		System.out.println("--------------\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of an Array: ");
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
		System.out.print("Enter how many smallest element, you'd like to display: ");
		int k = sc.nextInt();
		System.out.print("\nOriginal Array: ");
		displayArray(arr);

		kSmallest(sortedArray(arr), k);

		sc.close();

	}

}
