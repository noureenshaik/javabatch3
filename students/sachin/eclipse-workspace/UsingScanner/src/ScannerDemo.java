import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Student Number");
		int sno = sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String sname = sc.next();
		
		System.out.println("Enter the Student Fee");
		int sFee = sc.nextInt();
	
		System.out.println("Student Number is : " + sno);
		System.out.println("Student Name is : " + sname);
		System.out.println("Student Fee is : " + sFee);
	}

}
