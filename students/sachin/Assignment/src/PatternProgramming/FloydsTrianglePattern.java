package PatternProgramming;

import java.util.Scanner;

public class FloydsTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int limit = sc.nextInt();
		int num=1;
		for (int i=1;i<=limit;i++) {
			for (int j=1;j<=i;j++) {
				
//				if (num>limit)
//					System.exit(0);
		
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}

}
