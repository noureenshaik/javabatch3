package assignment2;

public class question9 {

	public static void main(String[] args) {
		int num = 0;
		int counter = 0;

		for (int i = 1; i <= 100; i++) {

			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.println("Prime numbers from 1 to 100 are :");
				System.out.println(i);
			}
		}

	}
}
