 import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Hangman {

    private static final String[] WORDS = {"APPLE", "BANANA", "ORANGE", "GRAPE", "MANGO", "STRAWBERRY", "BLUEBERRY"};
    private static final int MAX_WRONG_GUESSES = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            String secretWord = WORDS[random.nextInt(WORDS.length)].toUpperCase();
            char[] guessedWord = new char[secretWord.length()];
            Arrays.fill(guessedWord, '_');

            ArrayList<Character> guessedLetters = new ArrayList<>();
            int wrongGuesses = 0;

            System.out.println("Let's play Hangman!");
            System.out.println("The word has " + secretWord.length() + " letters.");

            while (wrongGuesses < MAX_WRONG_GUESSES && String.valueOf(guessedWord).contains("_")) {
                displayHangman(wrongGuesses);
                System.out.println("Word: " + String.valueOf(guessedWord));
                System.out.println("Guessed letters: " + guessedLetters);
                System.out.print("Enter your guess: ");
                String input = scanner.nextLine().toUpperCase();

                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println("Invalid input. Please enter a single letter.");
                    continue;
                }

                char guess = input.charAt(0);

                if (guessedLetters.contains(guess)) {
                    System.out.println("You already guessed that letter. Try again.");
                    continue;
                }

                guessedLetters.add(guess);

                boolean found = false;
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guess) {
                        guessedWord[i] = guess;
                        found = true;
                    }
                }

                if (!found) {
                    wrongGuesses++;
                    System.out.println("Incorrect guess!");
                } else {
                    System.out.println("Correct guess!");
                }
                System.out.println();
            }

            displayHangman(wrongGuesses);
            if (!String.valueOf(guessedWord).contains("_")) {
                System.out.println("Congratulations! You guessed the word: " + secretWord);
            } else {
                System.out.println("You ran out of guesses! The word was: " + secretWord);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.nextLine().toLowerCase();
            playAgain = playAgainChoice.equals("yes");
            System.out.println();
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }

    private static void displayHangman(int wrongGuesses) {
        switch (wrongGuesses) {
            case 0:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 1:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 2:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 7:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("=========");
                System.out.println("GAME OVER!");
                break;
        }
    }
}



