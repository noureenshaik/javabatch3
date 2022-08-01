import java.util.Scanner;

public class IndexOfAnArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,4,2,6,3,5,8,9,7};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 9 and I will tell you at which index it is in the Array");
		int n = sc.nextInt();
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n) {
				System.out.println("Index of the number in the Array is : "+i);
			}
		}

	}

}
