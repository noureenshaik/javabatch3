
public class SeparateEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9 };
		int newArr[] = new int[arr.length];
		int n = 0;
		int count = 0;
		while (n < 2) {
			if (n == 0) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] % 2 == 0) {
						newArr[count++] = arr[i];
					} // if even

				} // for loop
			} // if n

			if (n == 1) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] % 2 != 0) {
						newArr[count++] = arr[i];
					} // if odd

				} // for loop
			} // if n
			n++;
		}//while loop
		
		for(int i:newArr)
			System.out.print(i+ " ");
	}
}
