import java.util.Scanner;

public class colorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the color code: ");
		char code = Character.toUpperCase(sc.next().charAt(0));
//		char input = Character.toUpperCase(code);
		switch (code) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Choose the correct color: R,B,G,O,Y,W");
		}

	}

}
