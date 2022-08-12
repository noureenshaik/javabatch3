import java.util.Scanner;

public class FlowControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//w.a.p Based on age Major or Minor
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		
		if (age>18)
			System.out.println("He/She is a Major");
		else
			System.out.println("He/She is a minor");

	}

}
