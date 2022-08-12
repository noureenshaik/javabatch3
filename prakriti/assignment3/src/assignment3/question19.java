package assignment3;
//program to print first 5 values which are divisible by 2,3 and 5
public class question19 {
	public static void main(String[] args) {
		int firstValues = 5;
		int count = 0;
		int initNum = 1;
		while (count != firstValues) {
			if ((initNum % 2 == 0) && (initNum % 3 == 0) && (initNum % 5 == 0)) {
				System.out.println(initNum);
				count++;

			}
			initNum++;
		}
	}
}
