
public class Question12 {

	public static int getSecondSmallest(int[] arr) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		for (int j = 1; j < arr.length; j++) {
			if (arr[0] != arr[j])
				return arr[j];

		}

		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 20, 50, 9, 2, 50, 50, 50 };
		System.out.println("Second smallest element is: " + getSecondSmallest(arr));
	}

}
