
public class SumOfArrayAndEvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,2,14,34,1};
		
		int sum=sumOfArray(arr);
		isEvenOdd(sum);
		
		
		
	}
	
	public static void isEvenOdd(int sum) {
		if (sum%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
	
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i:arr)
			sum+=i;
		
		System.out.println("Sum of the Array is : " + sum);
		return sum;
	}

}
