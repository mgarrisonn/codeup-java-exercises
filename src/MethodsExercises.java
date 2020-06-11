import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
       static Scanner sc = new Scanner(System.in).useDelimiter("\n");


    //
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2){ return num1 - num2; }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        return num1 / num2;
    }
    public static double modulus(double num1, double num2){
        return num1 % num2;
    }

    public static void mathematics(){
        System.out.println(add(3,4));
        System.out.println(subtract(5,6));
        System.out.println(multiply(6,6));
        System.out.println(divide(21,7));
        System.out.println(modulus(2,3));
    }

    public static void main(String[] args) {
        mathematics();
    }


}
