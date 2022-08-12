package com.personal.bootcamp.flowcontrol;

import java.util.Scanner;

public class SumEven {
	public static void isEvenOdd(int[] arr) {
		int evenArray[]= new int[arr.length];
		int oddArray[]= new int[arr.length];
		int evenCount=0;
		int oddCount=0;
		for(int i=0; i<arr.length; ++i){
		if (arr[i] % 2 == 0) {
			evenArray[evenCount]=arr[i];
			evenCount++;
		} else {
			oddArray[oddCount]=arr[i];
			oddCount++;
		}
		}
		
		System.out.println("Even Array: ");
		for(int m:evenArray){
			if(m!=0){
			System.out.print(m+" ");
			}
		}
		System.out.println("\nOdd Array: ");
		for(int m:oddArray){
			if(m!=0){
			System.out.print(m+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; ++i) {
			System.out.print("Element " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		
	  isEvenOdd(arr);

	}

}
