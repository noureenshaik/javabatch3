
public class Question19 {

	static void getFrequency(String[] a) {
		String[] x = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			x[i] = a[i];
		}
		String[] temp = removeDuplicate(x);

		for (int i = 0; i < temp.length; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {
				if (a[j].compareToIgnoreCase(temp[i]) == 0) {
					count++;
				}
			}
			System.out.printf("Frequency of: %8s is %4d \n", temp[i], count);
		}
	}

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

		String[] arr = { "wanggyal", "Sherpa", "New York", "Nepal", "sherpa", "New york", "USA", "Indai", "Nepal", "1",
				"3", "1" };
		getFrequency(arr);
	}

}
