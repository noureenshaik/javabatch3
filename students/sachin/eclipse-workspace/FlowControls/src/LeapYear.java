import java.util.Scanner;

public class LeapYear {
	
	void isLeapYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeapYear obj = new LeapYear();
		obj.isLeapYear();

	}

}
