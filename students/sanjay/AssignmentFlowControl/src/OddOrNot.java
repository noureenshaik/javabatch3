import java.util.Scanner;


public class OddOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = sc.nextInt();
		
		
		if(n%2!=0) {
			System.out.println("it's a odd number");
		}
		else {
			System.out.println("it's not a odd number");
		}
		

	}

}
