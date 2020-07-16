import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in);

//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"

    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
//        this conditional validates if a # is within range
        if (userInput > max || userInput < min) {
            System.out.println("Please enter a number within the range.");
            return getInteger(min, max);
        }
        System.out.println("Thanks for entering a valid number!");
        return userInput;
    }

    public static void highLowGame(int guess, int answer) {
        if (guess == answer) {
            System.out.println("Good Guess! You got it");
        } else if (guess < answer) {
            System.out.println("Higher!");
            highLowGame(getInteger(1, 100), answer);
        } else {
            System.out.println("Lower!");
            highLowGame(getInteger(1, 100), answer);
        }
    }


    public static void main(String[] args) {

        System.out.println("High Low Game");

        do {
            int answer = (int) (Math.random() * 100) + 1;
            System.out.println("Pick a number please");
            highLowGame(getInteger(1, 100), answer);
            System.out.println("Would you like to continue?");
        } while (sc.next().equalsIgnoreCase("yes"));
    }
}
