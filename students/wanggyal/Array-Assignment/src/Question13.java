
public class Question13 {

	static int[] oddEvenSeparate(int[] a) {
		int temp[] = new int[a.length];

		int i = 0;
		int j = a.length - 1;
		for (int x : a) {
			if (isEven(x)) {
				temp[i] = x;
				i++;
			} else {
				temp[j] = x;
				j--;
			}

		}

		return temp;
	}

	static boolean isEven(int x) {
		if (x % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 20, 50, 9, 2, 50, 50, 50 };
		for (int x : oddEvenSeparate(arr)) {
			System.out.print(x + ", ");
		}
	}

}
