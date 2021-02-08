package numgame;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		final int SECRET_NUMBER = (int)(Math.random() * 100);
		int guesses = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("I'm thinking of a number...\nGuess:");
		int guess = scanner.nextInt();
		guesses ++;
	
		while (guess != SECRET_NUMBER) {
			if (guess < SECRET_NUMBER) {
				System.out.print("That number is too small, guess again:\n");
				guess = scanner.nextInt();
				guesses ++;
			} if (guess > SECRET_NUMBER) {
				System.out.print("That number is too big, guess again:\n");
				guess = scanner.nextInt();
				guesses ++;
			}
		}	if (guess == SECRET_NUMBER); {
				System.out.println("Well done, thats the number.\nYou took " + guesses + " guesses.");
		}
	}
}
