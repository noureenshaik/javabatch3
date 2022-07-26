import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Character: ");
		char ch = sc.next().charAt(0);
		char lowerCharacter = Character.toLowerCase(ch);
		char upperCharacter = Character.toUpperCase(ch);
		if (ch == lowerCharacter)
			System.out.println(ch + "=>" + upperCharacter);
		else
			System.out.println(ch + "=>" + lowerCharacter);
	}

}
