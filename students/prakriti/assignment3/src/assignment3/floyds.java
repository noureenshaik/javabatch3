package assignment3;

import java.util.Scanner;

public class floyds {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int sno = sc.nextInt();

		for (int i = 1; i <= sno; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
