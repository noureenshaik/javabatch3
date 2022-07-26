//Print first 5 values which are divisible by 2,3, and 5. While Loop
public class Exercise19 {

	public static void main(String[] args) {
		int maxNumRequired = 5;
		int count = 0;
		int startNum = 1;
		while (count != maxNumRequired) {
			if ((startNum % 2 == 0) && (startNum % 3 == 0) && (startNum % 5 == 0)) {
				System.out.println(startNum);
				count++;

			}
			startNum++;
		}
	}
}