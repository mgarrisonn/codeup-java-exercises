package exceptionsLecture;

import java.sql.SQLException;

public class ExceptionLecture {
    public static void main(String[] args) {

        // ================================ SLIDE 3

        // Exceptions
        // - a tool for error handling
        // - an object created from one of several different Exception classes
        // - contain a message that describes what happened
        // - thrown when the application can't perform an operation

//        throw new RuntimeException("Something went wrong");

        // writing code that's invalid will prompt an exception
//        String[] names = {"cathy", "bob"};
//        System.out.println(names[10]);

//        int x = 3;
//        int y = 0;
//
//        System.out.println(x / y);
//
//        throw new ArithmeticException("Cannot divide by zero");

        // Exceptions may be thrown

//        try {
//           String st = null;
//            System.out.println(st.toUpperCase());
//        } catch(ArithmeticException e) {
//            System.out.println("Error in arithmetic");
//        } catch(RuntimeException e){
//            System.out.println("A runtime exception happened");
//        } catch(Exception e) {
//            System.out.println("Something went wrong");
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("it will run");


//        try {
//            throw new RuntimeException("Something went wrong");
////            System.out.println("Everything is fine");
//        } catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("This will always run");
//        }

        // checked exception: any exception not descended from RuntimeException
        //  - must handle the exception - try catch
        // unchecked exception: any exception descended from RuntimeException
        //  - does not have to be handled

//        try {
//            throw new Exception(("Uh oh"));
//        } catch (Exception e){
//            e.printStackTrace();
//        }


//        try {
//            throw new Exception("Something went wrong");
//        } catch(NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch(RuntimeException e) {
//            System.out.println("Runtime exception happened");
//        } catch(Exception e) {
//            System.out.println("Something went wrong generally");
//        }
//
//        System.out.println("What will happen?");
//
//        System.out.println("Will this run?????");

        // You have to handle most exceptions that extend from Exception

//            try {
//                // risky things
//                boolean badThingHappened = true;
//                if (badThingHappened) {
//                    throw new Exception("EXCEPTION: you did the bad thing!!!");
//                }
//                System.out.println("This only runs if condition is false");
//            } catch(Exception e) {
//                System.out.println("You did x and it broke");
//                System.out.println(e.getMessage());
//                e.printStackTrace(System.out);
//            }

        // Curriculum Example


//            try {
//                System.out.println("Let's see...");
//                int result = 1 / 0;
//                System.out.println("I can divide by zero!");
//            } catch (ArithmeticException e) {
//                System.out.println("Math still works!");
//                System.out.println(e.toString());
//                System.out.println();
//                e.printStackTrace(System.out);
//            }

//            System.out.println("This will still run");




        // ================================ SLIDE 4

        // Try-Catch
        // - control flow structure
        // - catch blocks go from more to less specific
        // - finally: optional block that will always run

//        int[] numbers = {1, 2, 3};
//        int x = 5;
//        try {
//            x = numbers[1];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught!");
//            x = 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run.");
//            // normally used for "clean up" like closing file streams or DB connections
//        }
//        System.out.println(x);
//        System.out.println("This always runs");



        // we can catch multiple exceptions, including exceptions we defined

//            try {
//                double result;
//                String[] strings = {"Bob", "Fred", "Sally"}; // will not be caught by specific Exception
//                System.out.println(strings[3]);
//            } catch(ArrayIndexOutOfBoundsException e) {
//                System.out.println(e.toString());
//            } catch(Exception e) {
//                System.out.println("This won't run");
//                System.out.println(e.toString());
//            }


        // ================================ SLIDE 5 and 6

        // Typed of Exceptions
        // - checked: an exception that must be handled
        //   - enforced by the compiler
        // unchecked: an exception that doesn't need to be handled
        // exception: an error that occurs but is recoverable
        // runtimeException:

//        try {
//            throw new Exception("Bummer. The risky stuff failed. You'll handle it.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // ================================ SLIDE 7

        // catching a custom exception


//        try {
//            soutName("Bob"); // cannot call soutName without exception handling
//        } catch (NameIsBobException e) {
//            e.printStackTrace();
//        }


        // ================================ SLIDE 8


        // calling a method that handles an exception

//            thisHandlesAnException();

        // using throws in a method, we can kick the responsibility of handling the exception up the chain

//            try {
//                thisMakesAnException();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }

        // option enter
//        try {
//            throw new NameIsBobException("This name is Bob : (");
//        } catch (NameIsBobException e) {
//            e.printStackTrace();
//        }

        try {
            soutName("Bob");
        } catch (NameIsBobException e) {
            e.printStackTrace();
        }

    }

    public static void thisHandlesAnException() {
        try {
            throw new Exception("Yep, an exception again :(");
        } catch (Exception e) {
            System.out.println("EXCEPTION!!!");
            System.out.println(e.getMessage());
        }
    }

    public static void thisMakesAnException() throws Exception {
        throw new Exception("Exception!");
    }

    public static void soutName(String name) throws NameIsBobException {
        if (name.equalsIgnoreCase("bob")) {
            throw new NameIsBobException("NOOOOOOO!!!!");
        } else {
            System.out.println(name);
        }
    }

}
