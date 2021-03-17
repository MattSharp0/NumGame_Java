package numgame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int SECRET_NUMBER = (int) (Math.random() * 100);
		int guesses = 0;

		Scanner inputNumber = new Scanner(System.in);

		System.out.print("I'm thinking of a number...\nYour guess? ");
		int guess = inputNumber.nextInt();
		guesses++;

		while (guess != SECRET_NUMBER) {
			if (guess < SECRET_NUMBER) {
				System.out.println("That number is too small, guess again:");
				guess = inputNumber.nextInt();
				guesses++;
			}
			if (guess > SECRET_NUMBER) {
				System.out.println("That number is too big, guess again:");
				guess = inputNumber.nextInt();
				guesses++;
			}
		}
		if (guess == SECRET_NUMBER)
			;
		{
			System.out.println("Well done, " + SECRET_NUMBER + " is the number.\nYou took " + guesses + " guesses.");
		}
	}
}
