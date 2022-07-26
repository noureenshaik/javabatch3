import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		
		System.out.println("Enter the numbers in the Array : ");
		
		for (int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Displaying the Array : ");
		
		for(int num:arr) {
			System.out.println(num);
		}
		
		int max = arr[0], min = arr[0];
		for (int i=1;i<size;i++) {
			if (arr[i]>max)
				max = arr[i];
			
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("Max of the Array is : "+max);
		System.out.println("Min of the Array is : "+min);

	}

}
