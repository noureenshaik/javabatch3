import java.util.Scanner;

public class Question5 {
	static int getMax(int[] num) {
		int max = num[0];
		for (int j = 1; j < num.length; j++) {

			if (num[j] > max) {
				max = num[j];

			}
		}
		return max;
	}

	static int getMin(int[] num) {
		int min = num[0];
		for (int j = 1; j < num.length; j++) {

			if (num[j] < min) {

				min = num[j];
				// System.out.println("min value: "+min);
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[5];
		System.out.print("Populate the array with integer value:\n");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("Minimum value is: " + getMin(num));
		System.out.println("Maximum value is: " + getMax(num));

	}

}
