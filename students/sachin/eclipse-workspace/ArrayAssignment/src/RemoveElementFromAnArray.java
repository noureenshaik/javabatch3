import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,4,2,6,3,5,8,9,7};
		int a[]={1,4,2,6,3,5,8,9,7};
		System.out.println(Arrays.toString(ar));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which number do you want to remove from the Array?");
		int n = sc.nextInt();
		
		addZero(ar, n);
		
		copyingArray(a, n);
	}

	private static void addZero(int[] ar, int n) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n) {
				ar[i]=0;
			}
		}
			
			System.out.println("New Array after deletion of the value");
			System.out.print("[");
			for(int j:ar) {
				if(j!=0)
					System.out.print(j+", ");
			}
			System.out.print("]");
	}
	
	private static void copyingArray(int[] ar, int n) {
		int[] brr = new int[ar.length-1];
		int count=0;
		for (int i=0;i<ar.length;i++) {
			if(ar[i]!=n) {
				brr[count]=ar[i];
				count++;
			}
		}
		System.out.println();
		System.out.println("New Array after deletion of the value");
		System.out.println(Arrays.toString(ar));
	}

}