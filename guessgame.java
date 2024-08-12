package java_programs;
import java.util.Scanner;
import java.util.Random;

class Guess {
    private int score = 0;

    public void random() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("__WELCOME TO GUESSING GAME__\n\n");
            Random sc = new Random();
            int random = sc.nextInt(101); // Generates a random number between 0 and 100 inclusive
            System.out.println("The guess should be between 0 and 100.");
            System.out.println("In this game, you will have six trials.\n");
            System.out.println("Enter your guess number:");

            boolean guessedCorrectly = false;
            for (int i = 0; i < 6; i++) {
                int guess = input.nextInt();

                if (guess == random) {
                    System.out.println("CONGRATULATIONS! You guessed the correct number.");
                    score++;
                    guessedCorrectly = true;
                    break; // Exit the loop if the correct number is guessed
                } else if (guess < random) {
                    System.out.println("You entered a too low number.");
                } else {
                    System.out.println("You entered a too high number.");
                }

                if (i == 5) {
                    System.out.println("You lose. The correct number was " + random + ".");
                    System.out.println("Trials are ended.");
                }
            }

            System.out.println("Your current score: " + score);

            if (!guessedCorrectly || !playAgain(input)) {
                break;
            }
        }

        input.close();
    }

    private boolean playAgain(Scanner input) {
        System.out.println("Would you like to play again? (yes/no)");
        String response = input.next();
        return response.equalsIgnoreCase("yes");
    }
}

public class guessgame {
    public static void main(String[] args) {
        Guess var = new Guess();
        var.random();
    }
}
