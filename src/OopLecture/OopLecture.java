package OopLecture;

public class OopLecture {

    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)
//
//        Scanner sc = new Scanner(System.in);

//            OopLecture.Person rick = new OopLecture.Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            rick.age =  23;
//            System.out.println(rick.firstName);
//            System.out.println(rick.lastName);
//            System.out.println(rick.age);
//            System.out.println(rick.character);
//            System.out.println(rick.isEmployed);
////
//            OopLecture.Person fred = new OopLecture.Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
//            System.out.println(fred.firstName);
//            System.out.println(fred.lastName);


//        System.out.println(rick1 == rick2);
//        System.out.println(rick1);
//        System.out.println(rick2);
        // compared two similar names
        // given two different identifiers



        // -- OopLecture.Dog Example --


//            OopLecture.Dog d1 = new OopLecture.Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

//            OopLecture.Person rick = new OopLecture.Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

        // -- OopLecture.Dog Method Example --

            Dog d1 = new Dog();
            d1.age = 3;
            d1.breed = "corgi";
            d1.canBreed = false;
            d1.name = "Tater";

            d1.callForDog("Tater");
            d1.callForDog("Sparky");


        // ======================== slide 5 (class fields)


//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --




        // ======================== slide 7 (class vs. object fields)

//            OopLecture.Person theBestDrummerAlive = new OopLecture.Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            OopLecture.Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(OopLecture.Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



        // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.printx(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


    }

}