package arraysLecture;
import OopLecture.Person;

import java.util.ArrayList;
import java.util.Arrays;


public class ArraysLecture {
    // Primitive - these are the building block of the language.
    // Primitive type variables contain one value
    // Reference types refer to objects or arrays and default to null - which notes the lack of an object

    // Unlike arrays in javascript, arrays in java have a fixed length
    //  - The size of an array must be defined when created
    //  - This can wither be a literal, a constant or a variable


    // need to put static if out of the main
       static int numberOfPlanets = 8;

    public static String[] colorsCopy(String[] array, String color){
        String[] newCopy = Arrays.copyOf(array,array.length+1);

        newCopy[newCopy.length-1] = color;
        return newCopy;
    }

    public static void main(String[] args) {
        // One way of creating an array
//        int numberOfPlanets = 8;
//        String[] planets = new String[numberOfPlanets];

        // Another way to create an array
        String[] planets = new String[numberOfPlanets];
        System.out.println(planets.length);

        planets[0] = "Mercury";
        planets[7] = "Neptune";

        // Throws a compile time error. index 8 is out of bounds
//        planets[8] = "Pluto";

        System.out.println(planets[0]);
        System.out.println(planets[7]);

        int[] myNumbers = {1,2,3,4,5};

        // manipulate elements in for loop
        for(int x: myNumbers){
            ++x;
            System.out.println(x);
        }

        int[] otherNumbers = {5,6,7,8,9,10};
        Arrays.sort(otherNumbers);
        System.out.println(Arrays.toString(otherNumbers));

        System.out.println(Arrays.equals(myNumbers,otherNumbers));

        // Create an array containing person objects
        Person justin = new Person("Justin", "Reich");

        Person[] instructors = new Person[2];
//        Person[] instructors = {new Person(), new Person(), new Person()};
        instructors[0] = justin;
        instructors[1] = new Person("Sophie", "k");
        System.out.println(Arrays.toString(instructors));

        Person[] oneMoreInstructor = Arrays.copyOf(instructors,instructors.length + 1);
        System.out.println(Arrays.toString(oneMoreInstructor));
        oneMoreInstructor[2] = new Person("John","Smith");
        System.out.println(Arrays.toString(oneMoreInstructor));

        for(Person instructor : oneMoreInstructor){
            System.out.println(instructor.getFirstName());
        }


        // Creating an Array of Car objects
//        Car[] myCars = new Car[5];
//        myCars[0] = new Car();
//        myCars[0].setMake("Nissan");
//        myCars[0].setModel("Rogue");
//        myCars[0].setYear(2017);
//        System.out.println(myCars[0].getMake());
//        System.out.println(myCars[0].getModel());
//        System.out.println(myCars[0].getYear());


        // Iterating
        String[] theBeatles = {"John", "Ringo", "George", "Paul"};
        Arrays.sort(theBeatles);
        System.out.println(theBeatles);

        for(String beatle: theBeatles){
            System.out.println(beatle);
        }

        // Manipulating Arrays
        // java.util.Arrays
        // Arrays.fill

        String[] colors = new String[7];
        Arrays.fill(colors, "blue");
        // Arrays.toString
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colorsCopy(colors, "red")));
        // Arrays.equals
        System.out.println(Arrays.equals(instructors, theBeatles));



    }

}
