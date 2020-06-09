public class MethodsLecture {

        //  METHODS
        // Methods in jva are like functions to java script
        // a sequence of statments/ block of code that performs certain tasks
        // A method in java has a few main components
        // - visibility modifier
        // -

        // public - other classes can see this method
        // static - this method belongs to the class, not instances of it
        // void - has no return
        // main - method name

        // Method overloading
        // - We can define multiple methods with the same name
        //      -as long as they have different parameter type, parameter order or number of parameters
        // - Overloaded methods can call other versions of themselves

        // Recursion
        // imagine a method that continues to call itself until it meets a stopping point
        // it combines methods with loop concepts
        // problem solving technique

/*
    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */
//    public static void orderFood(){
//        System.out.println("I would like fries please.");
//    }
/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */

/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */
    public static void favoriteSong(String song){
        System.out.println("My favorite song is " + song);
    }
/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */

    public static void weeksIn(int weeks) {
        System.out.println("I'be been at codeup for " + weeks + "weeks");
    }
//  METHOD OVERLOADING
/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */
    //version 1
    public static void orderFood(){
        System.out.println("I would like fries please.");
    }

    // version 2
    public static void orderFood(String food) {
        System.out.printf("I would like %s please!\n", food);
    }

    //version 3
    public static String orderFood(int number, String order){
        return "Order" + number + " " + order;
    }

    public static void orderFood(String food, int number){
        System.out.printf("I would like %d %s\n", number, food);
    }

    public static void orderFood(String item1, String item2){
        System.out.printf("I would like %s and %s\n", item1, item2);
    }
/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */
/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */
//  RECURSION
/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.
    For example:
    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */
// HINT: The recursive method should return an int for each number in the series
// HINT: you may need an additional method using a for loop to actually print
// each number
        public static String helloWorld() {
            return "Hello World!";
        }

        public static void greetCohort(String greeting, String cohort) {
            System.out.println(greeting + " " + cohort);
        }

        public static void main(String[] args) {
            //version1
            orderFood();
            //version2
            orderFood("pizza");
            //
            orderFood(3, "Fries");
            //version3
            orderFood("Burgers", 3);
            //version4
            orderFood("sushi", "ramen");

            favoriteSong("righteous - juice wrld");

            String myGreeting = "Good day";
            String cohort = "Olympic";

            greetCohort("Good Morning", "Ganymede");
            greetCohort(myGreeting, cohort);
            System.out.println(helloWorld());
        }
}