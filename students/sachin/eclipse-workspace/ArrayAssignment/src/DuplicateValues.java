
public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 2, 3, 9, 5, 3, 1, 2, 5, 6, 7, 5, 7, 8, 8 };
		
		System.out.println("Integers that are repeated in the Array : ");
		repeatedValues(a);

	}

	private static void repeatedValues(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j] + " is repeated on the "+j+" index");
					break;
				}
			}
		} // for loop
	}

}
