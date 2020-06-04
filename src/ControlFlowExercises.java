import java.util.Scanner;


public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int i = 5;
       while (i <= 15) {
           System.out.println(i);
           i++;
       }

       int x = 0;
       do {
           System.out.print(x + " ");
           x += 2;
       } while (x <= 100);


       int y = 100;
       do {
           System.out.println(y);
           y -= 5;
       } while (y >= -10);

       long z = 2L;
       do {
           System.out.println(z);
           z *= z;
       } while(z < 1000000);

       for (int j = 5; j <= 15; j++) {
           System.out.print(j + " ");
       }

        for (int k = 100; k >= -10; k -= 5) {
            System.out.println(k);
        }

        for (int l = 1; l <= 100; l++) {
            if (l % 2 == 1) {
                continue;
            }
            System.out.println(l);
        }

        for (long m = 2L; m < 1000000; m*=m) {
            System.out.println(m);
        }

        for (int p = 1; p <= 100; p++) {
            if (p % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (p % 5 == 0) {
                System.out.println("Buzz");
            } else if (p % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(p);
            }
        }

        System.out.println("What number would you like to go up to?");
        int num = sc.nextInt();
        System.out.println("Here is your table");
        System.out.println("Number    | Squared     | Cubed");
        System.out.println("------------------------------------");
        for (int o = 1; o <= num; o++) {
            System.out.printf("%d         | %d           | %d%n" , o, o*o, o*o*o);
        }
        System.out.println("------------------------------------");


        System.out.println("Do you want to see your grades?");
        String confirm = sc.next();
        while (confirm.equalsIgnoreCase("Yes")) {
            System.out.println("What was your numeric grade?");
            int grade = sc.nextInt();

            char letterGrade;
            if (grade > 100) {
                System.out.println("Wow! nice job!");
                continue;
            } else if (grade >= 99){
                letterGrade = 'A';
            }else if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.printf("You received a %c.%n", letterGrade);
            System.out.println("Would you like to look at your letter grades?");
            confirm = sc.next();
        }

    }

}
