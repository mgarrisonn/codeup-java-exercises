import java.util.Scanner;


public class ConsoleExercises {
    public static void main (String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.", pi);
//
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInt = sc.nextInt();
//        System.out.println("The user entered: " + userInt);
//
//        System.out.println("Please enter three words...");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//        System.out.printf("%s%n%s%n%S%n", word1, word2, word3);
//
//        System.out.println("Please enter a sentence...");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("Please enter length of room in centimeters:");
        String length = sc.nextLine();
        System.out.println("Please enter width of room in centimeters");
        String width = sc.nextLine();
        int area = Integer.parseInt(length) * Integer.parseInt(width);
        int parameter = (Integer.parseInt(length) + Integer.parseInt(width)) * 2;
        System.out.printf("The area of the room is %d%nThe parameter of the room is %d", area, parameter);



    }

}
