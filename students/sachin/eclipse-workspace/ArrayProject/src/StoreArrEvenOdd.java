
public class StoreArrEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int even[] = new int[50];
		int odd[] = new int[50];
		int arr[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,15,16,17,14,34,76,44,32,22,44,45,57};
		
		addtoArray(even, odd, arr);
		
		System.out.println("Displaying Even numbers");
		displayArray(even);
		
		System.out.println("Displaying Odd numbers");
		displayArray(odd);

	}

	public static void displayArray(int[] even) {
		for(int i:even) {
			if (i!=0)
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void addtoArray(int[] even, int[] odd, int[] arr) {
		for (int i=0; i<arr.length;i++) {
			if (arr[i]%2==0)
				even[i] = arr[i];
			else
				odd[i] = arr[i];
		}
	}

}
