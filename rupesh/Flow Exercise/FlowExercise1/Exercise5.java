import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the character:");
		char Character = sc.next().charAt(0);
		int Value = Integer.valueOf(Character);
		if (Value >= 48 && Value <= 57)
			System.out.println("Digit");
		else if ((Value >= 65 && Value <= 90) || (Value >= 97 && Value <= 122))
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
	}

}
