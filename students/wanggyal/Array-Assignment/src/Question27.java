
public class Question27 {

	static void swap(int[] a, int[] b, int[] c) {

		int[] temp = a;
		a = b;
		b = c;
		c = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 4, 5, 6, 7, 8, 6, 5, 4 };
		int[] b = { 4, 5, 23, 2, 1, 1, 1, 2, 0 };
		int[] c = { 8, 8, 8, 8, 8, 88, 8, 8, 8 };

		swap(a, b, c);

	}

}
