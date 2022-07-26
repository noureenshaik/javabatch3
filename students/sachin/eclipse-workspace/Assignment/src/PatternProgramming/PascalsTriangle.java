package PatternProgramming;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows : ");
		int range = sc.nextInt();
		int num=1;
		for (int i=1;i<=range;i++) {
			num*=11;
			System.out.println(num);
		}

	}

}
