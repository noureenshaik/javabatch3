package com.personal.bootcamp.flowcontrol;
//10) Write a program to print numbers from 1 to 10 in a single row with one tab space.

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int startNum=1;
      int endNum=10;
      
      for (int i= startNum; i<=endNum; ++i){
    	  System.out.print(i+"\t");
      }
	}

}
