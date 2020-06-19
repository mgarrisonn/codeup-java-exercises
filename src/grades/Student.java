package grades;

import java.util.ArrayList;

public class Student {

//    public static void main(String[] args) {
//        Student s1 = Student("Michael");
//    }

     private String name;
     private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void studentGrades(int grade){
        grades.add(grade);
    }

    public double studentGradeAverage(){
        int average = 0;
        for(int i = 0; i < grades.size(); i++){
            average += grades.get(i);
        }
        return average / grades.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Michael");
        s1.studentGrades(90);
        s1.studentGrades(78);
        System.out.println(s1.studentGradeAverage());
    }


}
