import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 5, 6, 7, 8, 34, 54, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search in the Array : ");
		int n = sc.nextInt();
		boolean flag = false;
		for (int i : arr) {
			if (i == n) {
				System.out.println("Number found!");
				flag = true;
			}
		}
		if (flag == false)
			System.out.println("Number not found in the Array!");

	}

}
