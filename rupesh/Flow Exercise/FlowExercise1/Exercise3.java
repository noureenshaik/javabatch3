import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the command: ");
		var command = sc.next();
		sc.close();
		if (command.length() == 0)
			System.out.println("No Values");
		else
			System.out.print(command);
	}

}
// NOT COMPLETE NEEDS ATTENTION