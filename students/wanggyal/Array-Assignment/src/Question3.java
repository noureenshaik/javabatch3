import java.util.Scanner;

public class Question3 {
	static int indexOf(int[]arr,int a) {
		int i=0;
		for(int x:arr) {
			if(x==a) {
				return i;
			}
			i++;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		int[] arr= {1,23,4,45,65,56,33,56,9,99};
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int i=indexOf(arr,n);
		System.out.println((i>=0)?("The index of "+n+" is: "+i):("the number does not exist in the array."));
	}

}
