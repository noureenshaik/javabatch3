
public class SumOfTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,1,3};
		
		int sum = sumOfArray(arr);
		
		isPrime(sum);
		
	}


	public static void isPrime(int sum) {
		if (sum==2)
			System.out.println("Given Number is Prime");
		
		for (int i=2;i<sum;i++) {
			if (sum%i==0) {
				System.out.println("Given number is not Prime");
			break;
			}
			if  (i==sum-1)
			{
				System.out.println("Given number is Prime");
			}
		}
	}

	
	public static int sumOfArray(int[] arr) {
		int sum= 0;
		
		for (int i : arr) {
			sum+=i;
		}
		
		System.out.println("Sum of the Array is : " + sum);
		
		return sum;
	}
	
	

}
