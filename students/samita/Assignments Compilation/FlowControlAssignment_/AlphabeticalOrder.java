package com.personal.bootcamp.flowcontrol;

/*4) Initialize two character variables in a program and display the characters in alphabetical order.
	 Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and second 
	 is e O/P:a,e  (If Statement) 	*/

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char fChar= 'a';
		char sChar= 'b';
		
		if(fChar>sChar){
			System.out.println(sChar+","+fChar);
		}
		else if(sChar>fChar){
			System.out.println(fChar+","+sChar);
		}
		else{
			System.out.println("Same characters: "+fChar);
		}
	}

}
