import java.util.Random;
import java.util.Scanner;

public class CheckRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generate random number

		int value = randomNumber();

		guessWorkflow(value);

		System.out.println("Program Terminated!!!");
	}

	public static void guessWorkflow(int value) {
		for (int i = 1; i <= 5; i++) {
			// User Input
			try {
				int guess = userInput(i);
				// System.out.println("User input is: " + guess);

				// Check if it is single digit
				if (guess < 9) {
					// System.out.println("yes single digit");
					if (guess == value) {
						System.out.println("You guessed it right");
						break;
					} else
						System.out.println("Wrong guess, try again!");
				}

				else
					System.out.println("Not a single digit retry : ");
				
			} catch (Exception e) {
				System.out.println("Don't put String");
			}
		}

	}

	public static int userInput(int i) {
		if (i == 5)
			System.out.println("Last Try. Do or die");
		else
			System.out.println("Try No : " + i);

		System.out.println("Guess your number : ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		return guess;
	}

	public static int randomNumber() {
		int min = 1;
		int max = 9;

		Random random = new Random();

		int value = random.nextInt(max - min + 1) + min;
		// System.out.println(value);
		return value;
	}

}
