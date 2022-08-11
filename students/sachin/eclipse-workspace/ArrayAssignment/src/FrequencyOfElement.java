
public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 3, 4, 5, 5, 5, 5, 4, 6, 7, 8, 8, 8, 8, 9, 9 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (checkRepeated(a[i], b))
				continue;
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] == a[j])
					count++;
			}
			if (count > 1)
				b[i] = a[i];
			System.out.println(a[i] + " = " + count);
		}
	}

	static boolean checkRepeated(int a, int b[]) {
		boolean flag=false;
		for (int i = 0; i < b.length; i++) {
			if (a == b[i]) {
				flag=true;
				break;
			}

		}
		return flag;
	}
}
