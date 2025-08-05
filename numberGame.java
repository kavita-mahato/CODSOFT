import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int randomNum = (int) (Math.random() * 100) + 1; // 1 to 100
            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;
            int score = 0;

            System.out.println("\nGuess the number between 1 and 100. You have 5 attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNum) {
                    guessedCorrectly = true;
                    score = 50 - ((attempts - 1) * 10);
                    System.out.println("Congrats! You guessed the correct number in " + attempts + " attempt(s).");
                    break;
                } else if (guess < randomNum) {
                    if(attempts != 5)
                        System.out.println("Too low! Try a higher number.");
                } else {
                    if(attempts != 5)
                        System.out.println("Too high! Try a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Oops! You've used all attempts! The correct number was: " + randomNum);
                score = 0;
            }

            // Print final score
            System.out.println("Your final score is: " + score);

            // Ask to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String response = sc.nextLine().trim().toLowerCase();

            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }

        sc.close();
    }
}
