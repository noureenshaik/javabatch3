package com.personal.bootcamp.flowcontrol;
/*3)Write a program to check if the program has received command line arguments or not. 
    If the program has not received the values then print "No Values", else print all 
    the values in a single line separated by ,(comma). Eg1) java Example O/P: No values 
    Eg2) java Example Mumbai Bangalore O/P: Mumbai,Bangalore
    [Note: You can use length property of an array ]*/

 class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("No Values");
		} else {
			System.out.println("The number of Command line Argument is: " + args.length);
			for (String str : args) {
				System.out.print(str+", ");
			}
		}
	}

}
