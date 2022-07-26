package com.personal.bootcamp.flowcontrol;

import java.util.Scanner;

public class caset {

public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter any character");

        

        char s = sc.next().charAt(0);

        myConverter(s);

        

    }



    

    public static void myConverter(char s) {

       
        char b= ' ';

        if(Character.isUpperCase(s)) {

           b=Character.toLowerCase(s);
           System.out.println(b);

        }
        else if(Character.isLowerCase(s)) {

            b=Character.toUpperCase(s);
            System.out.println(b);

         }
        else{
        	System.out.println("Invalid Character to convert");
        }
}
}
