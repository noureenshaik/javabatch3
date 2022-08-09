
public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,6,7,25,4,76,54,3,2};
		int sum=0;
		int length = arr.length;
		for (int i : arr) {
			sum+=i;
		}
		System.out.println("Average of the Array is : "+(sum/length));
	}

}
