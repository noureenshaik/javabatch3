
public class Exercise13Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
//		int count = 0;
		for (i = 10; i < 100; ++i) {
			int count = 0;
			for (j = 1; j <= i; ++j) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(i);
		}

	}

}
