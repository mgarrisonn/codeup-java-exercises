import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");


    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static void mathematics() {
        System.out.println(add(3, 4));
        System.out.println(subtract(5, 6));
        System.out.println(multiply(6, 6));
        System.out.println(divide(21, 7));
        System.out.println(modulus(2, 3));
    }

    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
//        this conditional validates if a # is within range
        if(userInput > max || userInput < min){
            System.out.println("Please enter a number within the range.");
            return getInteger(min, max);
        }
        System.out.println("Thanks for entering a valid number!");
        return userInput;
    }

    public static void rollDice(int sides){
        int firstDice = (int)(Math.random() * sides) + 1;
        int secondDice = (int)(Math.random() * sides) + 1;
        System.out.printf("1st Result: %d | 2nd Result: %d%n", firstDice, secondDice);
    }

    public static void main(String[] args) {

        do{
            System.out.println("Let's roll a pair of dice. How many sides? ");
            rollDice(getInteger(1,10));
            System.out.println("Would you like to continue?(y/n)");
        }while(sc.next().equalsIgnoreCase("y"));


        int number;
        String response;
        long fact = 1;
        do {
            number = getInteger(1, 26);
            System.out.println("Calculate factorial of " + number + "!...?");
            System.out.println("Continue?(y/n)");
            response = sc.next();
        } while (!response.equalsIgnoreCase("y"));

        System.out.println(fact);
        System.out.print(number + "! = ");
//        Factorials example WITHOUT recursion
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
            if (i < number) {
                System.out.print(i + " x ");
            } else {
                System.out.println(i + " = " + fact);
            }
        }


        mathematics();


    }
}
