
public class Question25 {
	public static int[] sortDescending(int[] arr) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 43, 4, 5, 3, 32, 6, 7, 88, 99, 55, 66, 90, 333 };

		for (int x : sortDescending(arr)) {
			System.out.println(x);
		}
	}
}
