import java.util.Scanner;

public class Question15 {

	public static int getKSmallest(int[] arr, int n) {

		arr = removeDuplicate(arr);
		if (n >= arr.length) {
			System.out.println("There are only " + (arr.length - 1) + " non duplicate array elements!");
			System.exit(0);
		}
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

		return arr[n - 1];
	}

	static int[] removeDuplicate(int[] a) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[i] = -1;
					count++;
				}
			}
		}

		int result[] = new int[a.length - count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				result[j] = a[i];
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 20, 50, 9, 2, 50, 50, 50, 90, 100, 78 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the K value: ");
		int n = sc.nextInt();
		String msg = "th";
		if (n == 0) {
			System.out.println("Enter number between 1 to " + (arr.length - 1));
			System.exit(0);
		} else if (n == 1)
			msg = "st";
		else if (n == 2)
			msg = "nd";
		else if (n == 3)
			msg = "rd";
		System.out.println(n + msg + " Smallest Element is: " + getKSmallest(arr, n));
	}
}
