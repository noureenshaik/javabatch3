
public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 1, 2, 5, 6, 8, 4, 2, 10, 5, 6, 3, 0, 4, 5, 5, 6, 7, 8, 3 };
		int max = ar[0];
		int min = ar[0];

		for (int i : ar) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		
		System.out.println("Max Number of the Array is : "+max);
		System.out.println("Min Number of the Array is : "+min);
	}
}
