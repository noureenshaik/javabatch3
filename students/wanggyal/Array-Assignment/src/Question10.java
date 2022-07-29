
public class Question10 {

	static String[] removeDuplicate(String[] a) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareToIgnoreCase(a[j]) == 0) {
					a[i] = "-1";
					count++;
				}
			}
		}

		String result[] = new String[a.length - count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (!a[i].contains("-1")) {
				result[j] = a[i];
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "wanggyal", "Sherpa", "New York", "Nepal", "sherpa", "New york", "USA", "Indai", "Nepal", "1",
				"3" };

		System.out.println("New Array is:");
		for (String a : removeDuplicate(arr)) {
			System.out.print(a + ", ");
		}

	}

}
