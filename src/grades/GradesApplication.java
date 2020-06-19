package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>()>;
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



    }

}
