import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		if (age>18)
		{
			System.out.println("Enter the Weight");
			int weight = sc.nextInt();
			if (weight>40)
				System.out.println("He/She can give Blood");
			else
				System.out.println("Under the weight cannot give the Blood");
		}
		
		else
			System.out.println("He/She is minor");
		
		sc.close();
	}

}
