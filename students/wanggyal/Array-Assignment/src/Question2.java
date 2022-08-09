import java.util.Scanner;

public class Question2 {
	static boolean contains(int[] arr, int a) {
		for(int x:arr) {
			if(x==a) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {1,23,4,45,65,56,33,56,9,99};
		System.out.println("Enter a number to check:");
		int n=sc.nextInt();
		System.out.println(contains(arr,n)?("It contains the number: "+n):("It Does not contains the number: "+n));
	}

}
