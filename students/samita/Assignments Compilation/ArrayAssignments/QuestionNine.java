package com.personal.bootcamp.arrayassignment;

//Write a Java program to find the common elements between two
//arrays (string values)
import java.util.Scanner;

public class QuestionNine {
	// Method to find the common elements
	public static void commonElements(String[] arr1, String[] arr2) {

		for (int i = 0; i < arr1.length; i++) {
			int count=0;
			String temp = arr1[i];
			for(int j=0; j<arr2.length;++j){
				if(temp.equals(arr2[j])){
					count++;
					arr2[j]="  ";
				}
			}
			if(count>0){
				System.out.print(temp+" ");
			}
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
		System.out.println("Question No 9: ");
		System.out.println("--------------\n");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Length of an array : ");
		int n = sc.nextInt();
	

		String[] arr1 = new String[n];
		String[] arr2 = new String[n];

		System.out.println();
		System.out.println("For Array 1: ");
		for (int i = 0; i < n; ++i) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr1[i] = sc.next();
		}
		System.out.println();
		System.out.println("For Array 2: ");
		for (int i = 0; i < n; ++i) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr2[i] = sc.next();
		}

		System.out.print("\n==================================================\n");
		System.out.println("Original Array: ");
		System.out.print("Array 1 ");
		displayArray(arr1);
		System.out.print("Array 2 ");
		displayArray(arr2);

		System.out.print("\nCommon elements between given array [Array 1 and Array 2] are: ");
		System.out.print("\n============================================================\n ==>  ");
		commonElements(arr1, arr2);
		System.out.print("\n==============================================================\n");

		
		sc.close();

	}

}
