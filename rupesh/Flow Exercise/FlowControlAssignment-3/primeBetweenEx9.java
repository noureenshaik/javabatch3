
public class primeBetweenEx9 {

	public static void main(String[] args) {
		// w.a.p to print prime numbers between 1 and 100.

		int i;
		for (i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(i);
			}

		}
	}

}
