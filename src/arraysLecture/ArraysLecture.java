package arraysLecture;

public class ArraysLecture {
    // Primitive - these are the building block of the language.
    // Primitive type variables contain one value
    // Reference types refer to objects or arrays and default to null - which notes the lack of an object

    // Unlike arrays in javascript, arrays in java have a fixed length
    //  - The size of an array must be defined when created
    //  - This can wither be a literal, a constant or a variable

    public static void main(String[] args) {
        //one way of creating an array
//        int numberOfPlanets = 8;
//        String[] planets = new String[numberOfPlanets];

        //another way to create an array
        String[] planets = new String[8];
        System.out.println(planets.length);

        planets[0] = "Mercury";
        planets[7] = "Neptune";

        System.out.println(planets[0]);
        System.out.println(planets[7]);

    }

}
