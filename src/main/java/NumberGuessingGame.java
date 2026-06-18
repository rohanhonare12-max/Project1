import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != randomNumber) {

            try {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                // Validation
                if (guess < 1 || guess > 100) {
                    System.out.println("Enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                // High-Low Feedback
                if (guess > randomNumber) {
                    System.out.println("Too High!");
                }
                else if (guess < randomNumber) {
                    System.out.println("Too Low!");
                }
                else {
                    System.out.println("Congratulations!");
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); // clear invalid input
            }
        }

        sc.close();
    }
}