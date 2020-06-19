package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Michael");
        s1.studentGrades(92);
        s1.studentGrades(74);
        s1.studentGrades(73);
        Student s2 = new Student("Jason");
        s2.studentGrades(87);
        s2.studentGrades(81);
        s2.studentGrades(98);
        Student s3 = new Student("Kevin");
        s3.studentGrades(64);
        s3.studentGrades(72);
        s3.studentGrades(91);
        Student s4 = new Student("Trey");
        s4.studentGrades(71);
        s4.studentGrades(79);
        s4.studentGrades(93);

        students.put("michael123", s1);
        students.put("Jason123", s2);
        students.put("Kevin123", s3);
        students.put("Trey123", s4);

        System.out.println("Welcome\n\n" +
                "Here are the GitHub usernames of our students:\n\n" +
                "|michael123| |Jason123| |Kevin123| |Trey123|\n");
        searchUser(students);
    }

    public static void searchUser(HashMap<String, Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat student would you like to see more information on?\n");
        String searchedUser = sc.nextLine();
        if (students.containsKey(searchedUser)){
            System.out.println("\nName: " + students.get(searchedUser).getName() +
                    "\nCurrent Average: " + students.get(searchedUser).studentGradeAverage() + "\n");
        } else
            System.out.println("\nSorry, no student found with the Github username of \"" + searchedUser + "\".\n");
        System.out.println("Would you like to see another student?\n");
        String input = sc.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            searchUser(students);
        } else {
            System.out.println("\nGoodbye, and have a wonderful day!");
        }
    }

}
