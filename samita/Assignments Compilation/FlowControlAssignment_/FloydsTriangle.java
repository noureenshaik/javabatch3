package com.personal.bootcamp.flowcontrol;
// 16) Write a program to print * in Floyds format (using for and while loop) *

public class FloydsTriangle {
	public static void usingForLoop(){
		System.out.println("Using For Loop: ");
		System.out.println("-----------------\n");
		for (int i=1; i<=3; ++i){
			for(int j=1; j<=i;++j){
				System.out.print("*"+"  ");
			}
			System.out.println();
		}
	}
	public static void usingWhileLoop(){
		System.out.println("\nUsing While Loop: ");
		System.out.println("-----------------\n");
		int i=1;
		while(i<=3){
			int j=1; 
			while(j<=i){
				System.out.print("*"+"  ");
				++j;
			}
			System.out.println();
			++i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingForLoop();
		usingWhileLoop();
		

	}

}
