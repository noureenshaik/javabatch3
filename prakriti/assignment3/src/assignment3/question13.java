package assignment3;
//to print the prime number between 10 and 99
public class question13 {
	void isPrime() {
		int count = 0;
		for (int i = 10; i <= 99; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count < 2)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question13 eo = new question13();
		eo.isPrime();

	}
}
