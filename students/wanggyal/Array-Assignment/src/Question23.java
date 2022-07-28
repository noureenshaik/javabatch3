
public class Question23 {

	static int getSum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,55,434,78,99,90,342,666};
		System.out.println("Sum of all element of array is: "+getSum(arr));
	}

}
