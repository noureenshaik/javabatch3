import java.util.Scanner;

public class EvenNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for the range: ");
		int range = sc.nextInt();
		
		System.out.println("List of Even Numbers between 1 and "+range);
		for (int i=1;i<range;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
