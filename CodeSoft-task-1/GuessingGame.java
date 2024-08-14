import java.util.Random;
import java.util.Scanner;
 
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            int guess = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess a number between 1 and 100:");
            while (!hasGuessedCorrectly && numberOfAttempts < 10) {
                guess = scanner.nextInt();
                numberOfAttempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again:");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again:");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct number in " + numberOfAttempts + " attempts.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
