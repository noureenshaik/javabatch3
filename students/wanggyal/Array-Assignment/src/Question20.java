
public class Question20 {

	static void printReverse(String[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "wanggyal", "Sherpa", "New York", "Nepal", "sherpa", "New york", "USA", "Indai", "Nepal", "1",
				"3", "1" };
		printReverse(arr);
	}

}
