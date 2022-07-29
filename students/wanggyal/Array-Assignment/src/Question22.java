
public class Question22 {

	static void printOddPosition(String[] a) {
		for (int i = 1; i < a.length; i = i + 2) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "wanggyal", "Sherpa", "New York", "Nepal", "sherpa", "New york", "USA", "Indai", "Nepal", "1",
				"3", "1" };
		printOddPosition(arr);
	}

}
