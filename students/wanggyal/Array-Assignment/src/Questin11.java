
public class Questin11 {

	public static int getSecondLargest(int[] arr) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		for (int j = arr.length - 2; j >= 0; j--) {
			if (arr[arr.length - 1] != arr[j])
				return arr[j];
			
		}
		
		return arr[arr.length-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 20, 50, 9, 2 ,50 ,50 ,50};
		System.out.println("Second Largest Element is: " + getSecondLargest(arr));
	}

}
