package july25;

import java.util.Scanner;

public class MulitDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		
		System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.print(arr[1][0]);
		System.out.print(arr[1][1]);
		System.out.println(arr[1][2]);
		
		System.out.print(arr[2][0]);
		System.out.print(arr[2][1]);
		System.out.println(arr[2][2]);
		
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.println("Enter element: ");
				arr[i][j]=sc.nextInt();
			}
		}
		int allSum=0;
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println("="+sum);
			allSum=allSum+sum;
		}
		System.out.println("Total Sum: "+allSum);
	}

}
