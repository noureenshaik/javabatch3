
public class Question9 {
	static void duplicateValue(String[] a, String[] b) {
		System.out.println("Duplicate values are: ");
		String[] result = new String[a.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = "";
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i].compareToIgnoreCase(b[j]) == 0) {
					result[j] = a[i];
					break;
				}
			}
		}

		for (int i = 0; i < result.length; i++) {
			if (!result[i].isEmpty())
				System.out.print(result[i] + ", ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "wanggyal", "Sherpa", "New York", "Nepal", "sherpa", "New york", "USA", "Indai", "Nepal" };
		String[] arr1 = { "SHIVA", "Sherpa", "New", "SHrilanka", "sherpa", "New york", "USA", "Indai", "Canada" };

		duplicateValue(arr, arr1);
	}
}
