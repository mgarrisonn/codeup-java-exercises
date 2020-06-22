import javax.naming.PartialResultException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileIOLecture {

    public static void main(String[] args) throws IOException {
        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get("src/grades","Student");
        Path ignoreFile = Paths.get(".gitignore");


        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myFile));
        System.out.println(Files.notExists(ignoreFile));


        // creates a directory if there is not one currently there
        String directory = "test";
        Path myTest = Paths.get(directory);

        if(Files.notExists(myTest)){
            try {
                Files.createDirectory(myTest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Path helloFile = Paths.get(directory, "hello.txt");

        if(Files.notExists(helloFile)){
            try {
                Files.createFile(helloFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // writing to hello.txt
        String[] names = {"justin", "sophie", "vivien"};
        List<String> instructors = Arrays.asList(names);
        instructors.add("Casey");

        List<String> students = new ArrayList<>();
        students.add("Laura");
        students.add("Andrew");
        students.add("Mark");
        students.add("Aaron");
        students.add("Jay");
        try {
            Files.write(helloFile, students);
        } catch (IOException e) {
            e.printStackTrace();
        }
//
//        // this code is redundant bc
//        try {
//            List<String> myStudents = Files.readAllLines(helloFile);
//            System.out.println(myStudents);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        List<String> myStudents = Files.readAllLines(helloFile);
        for(String student : myStudents){
            System.out.println(student);
        }

        String newStudent = "Ramon";
        List<String> newStudents = Arrays.asList("Ramon", "Justin", "Bobbie", "Julia", "Augustine", "Sophie");
        Files.write(helloFile, newStudents, StandardOpenOption.APPEND);
//        Files.write(helloFile, Arrays.asList("Ramon"), StandardOpenOption.APPEND);

        // replacing sophie and adding shelby
        List<String> newList = new ArrayList<>();
        for (String student : myStudents){
            if(student.equals("Sophie")){
                newList.add("Shelby");
                continue;
            }
            newList.add(student);
        }

        Files.write(helloFile, newList);
        System.out.println(newList);

    }
}
