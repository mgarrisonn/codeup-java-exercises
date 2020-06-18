package collectionsLecture;
import java.util.*;

public class ArrayListsLecture {

    public static void main(String[] args){
        // Creating ArrayList
        ArrayList<String> instructors = new ArrayList<>();

//        int[] threeNumbers = {10,2,6};
        List<String> randomList = new ArrayList<>();
        List<Integer> threeNumbers = Arrays.asList(10,2,6);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();


        // Adding elements to ArrayLists
        instructors.add("Justin");
        instructors.add("Sophie");
        instructors.add("Casey");
        instructors.add("Vivian");
        instructors.add(0, "David");
        System.out.println(instructors);
        System.out.println(instructors.size());


        numbers.add(10);
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(10));
        // will always get a -1 if number does not exist in the list
        System.out.println(numbers.indexOf(8));
        //returns 7 - last time 10 appears
        System.out.println(numbers.lastIndexOf(10));


        // return two different hash codes for person 1 and person 2
        people.add(new Person("bob", "ross"));
        people.add(new Person("jane", "doe"));
        people.add( 0,new Person("john", "smith"));
        System.out.println(people);
        // grab something at a specific index
        System.out.println(people.get(1));

        // iterate through person to get person first name
        for(Person x : people){
            System.out.println(x.getFirstName());
        }

        // will return true
        // return type is a boolean
        System.out.println(instructors.contains("Justin"));
        //returns false
        System.out.println(instructors.contains("justin"));
        System.out.println(instructors.isEmpty());
        System.out.println(randomList.isEmpty());


        // Removing an element from an ArrayList
        // Removes first instance of "David"
        instructors.remove("David");
        instructors.remove(0);
        System.out.println(instructors);




    }
}
