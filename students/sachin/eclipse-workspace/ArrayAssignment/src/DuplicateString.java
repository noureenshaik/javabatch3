
public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = { "Sita", "Geeta", "Ram", "Laxman", "Hari", "Geeta" };
		String b[] = { "Gopal", "Shiva", "Hari", "Ram" };
		System.out.println("Common Strings in the both Arrays : ");
		repeatedValues(a, b);

	}

	private static void repeatedValues(String[] a, String[] b) {

		for (int i = 0; i < a.length; i++) {
			boolean flag = true;

			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = false;
					break;
				} // if else

			} // inner for loop
			if (flag == false)
				System.out.println(a[i]);
		} // outer for loop

	}

}
