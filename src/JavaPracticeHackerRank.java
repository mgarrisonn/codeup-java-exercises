import java.util.Scanner;



public class JavaPracticeHackerRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Print Hello, World. on the first line.
        //Print Hello, Java. on the second line.
//        System.out.println("Hello, World");
//        System.out.println("Hello, Java.");


        //In this challenge, you must read  integers from stdin and then print them to stdout.
        // Each integer must be printed on a new line.
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);


        //input
        //Every line of input will contain a String followed by an integer.
        //Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

        //Output
        //In each line of output there should be two columns:
        //The first column contains the String and is left justified using exactly  characters.
        //The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.format("%-15s%03d%n", s1, x);
//
//        }
//        System.out.println("================================");

        // Given an integer, N, print its first 10 multiples. Each multiple N * i  (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.

        int N = sc.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + N*i);

        }


    }
}
