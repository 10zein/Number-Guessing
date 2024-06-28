import java.util.Scanner;
import java.util.Random;

public class Main {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(100) + 1;
        int attempts = 0;
        int max_attempts = 5;
        int guess = 0;
        public void Guess()
        {
            for(attempts = 1; attempts<=max_attempts;attempts++){
                System.out.print("Guess a number between 1 to 100: ");
                guess = input.nextInt();

                if (guess == random) {
                    System.out.println("Your guess is correct!");
                    break;
                } else if (guess < random) {
                    System.out.println("Higher. Attempts left: " + (max_attempts - attempts));
                } else {
                    System.out.println("Lower. Attempts left: " + (max_attempts - attempts));
                }
                if (attempts == max_attempts && guess != random) {
                    System.out.println("Sorry, you have run out of attempts. The correct number was: " + random);
                }
            }
        }
    public static void main(String[] args) {

        Main gameGuess = new Main();
        gameGuess.Guess();

    }
    }
        /*do {
            System.out.print("Guess a number between 1 to 100: ");
            guess = input.nextInt();
            attempts++;

            if (guess == random) {
                System.out.println("Your guess is correct!");
                break;
            } else if (guess < random) {
                System.out.println("Higher. Attempts left: " + (max_attempts - attempts));
            } else {
                System.out.println("Lower. Attempts left: " + (max_attempts - attempts));
            }
            if (attempts == max_attempts && guess != random) {
                System.out.println("Sorry, you have run out of attempts. The correct number was: " + random);
            }

        } while (attempts < max_attempts);
        */