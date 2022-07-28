package com.personal.bootcamp.flowcontrol;

/*  5) Intialize a character variable in a program and if the value is alphabet then print
 	"Alphabet" if it’s a number then print "Digit" and for other characters print 
 	"Special Character"
			(If Statement) 	*/

public class AlphaNum {
	public static String isAlphaNum(char ch) {
		if ((ch >=47 &&ch<=57)) {
			return "Digit";
		} else if ((ch >= 65 && ch >= 90) || (ch >= 97 && ch <= 122)) {
			return "Alphabet";
		} else {
			return "Special Characters";
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		char charName = '0';
		System.out.println(isAlphaNum(charName));
	}

}
