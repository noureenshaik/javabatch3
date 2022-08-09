import java.util.Scanner;

public class KLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
		 
		 sorting(arr);
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter how many Largest Numbers");
		 int k=sc.nextInt();
		 System.out.println("The "+k+" largest numbers from the array are:");
		 
		 display(arr,k);
	}
	
	static void sorting(Integer[] arr) {
		int temp=0;
		for (int i=0;i<arr.length;i++)
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
	}
	
	static void display(Integer[] arr, int k) {
		for(int i=0;i<k;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
