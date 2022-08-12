
public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 15, 20, 25, 63, 96, 13, 57 };
		int max = arr[0];
		int max2 = arr[0];
		int min= arr[0];
		int min2=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max2 = max;
				max = arr[i];
			}//if condition max
			
			if(min>arr[i]) {
				min2=min;
				min=arr[i];
			}
		}//for loop
		
		System.out.println("2nd Largest Number is : "+max2);
		System.out.println("2nd Smallest Number is : "+min2);
	}

}
