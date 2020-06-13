import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] family, Person person){
        Person[] oneMoreFam = Arrays.copyOf(family, family.length + 1);
        oneMoreFam[oneMoreFam.length - 1] = person;
        return oneMoreFam;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] family = new Person[3];
        family[0] = new Person("michael");
        family[1] = new Person("trey");
        family[2] = new Person("amanda");

        family = addPerson(family, new Person("molly"));
        for (Person fam: family){
            System.out.println(fam.getName());
        }





    }


}
