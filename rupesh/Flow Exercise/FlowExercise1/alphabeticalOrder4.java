import java.util.Scanner;

public class alphabeticalOrder4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first character variable");
		char firstChar = sc.next().charAt(0);
		System.out.println("Enter the second character variable");
		char secondChar = sc.next().charAt(0);

		if (firstChar < secondChar)
			System.out.println(firstChar + "," + secondChar);
		else
			System.out.println(secondChar + "," + firstChar);
	}

}
