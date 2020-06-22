package InheritanceLecture;

public class AnimalTest {

    public static void makeAnimalsNoisy(Animal[] animals){
        for (Animal a : animals){
            a.makeNoise();
        }
    }

    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.setAge(3);
//        a.setSpecies("Primate");
//
//        Dog d = new Dog();
//        d.setSpecies("Canine");
//        d.setAge(7);
//
//        Cat c = new Cat();
//        c.setSpecies("Feline");
//        c.setAge(2);

//        a.makeNoise();
//        d.makeNoise();
//        c.makeNoise();

//        System.out.println(a.printSummary());
//        System.out.println("=================");
//        System.out.println(d.printSummary());
//        System.out.println("=================");
//        System.out.println(c.printSummary());
//
//
//        System.out.println(a.toString());
//        System.out.println("=================");
//        System.out.println(d.toString());
//        System.out.println("=================");
//        System.out.println(c.toString());

        Dog d = new Dog("Canine", 3, "Pug", "freckles", "Mr. smith");
//        d.soutProtectedProp();
//        d.makeNoise();

        Cat c = new Cat("Feline", 7, 9);
//        c.makeNoise();

        // creating an array to hold any object that extends from type animal
        Animal[] animals = new Animal[2];
        animals[0] = d; // assign dog object
        animals[1] = c; // assign cat object

        // example of casting to use a sub-type specific field
        Dog dog = (Dog) animals[0];
        dog.fetchBall();

        makeAnimalsNoisy(animals); // calling a method that uses array of animals


//        d.setAge(3);
//        d.setSpecies("Canine");
//        d.setBreed("Pug");
////        d.makeNoise();
//        d.makeNoise("Bark bark!!");
//        d.makeGenericAnimalNoise();
//
//        System.out.println(d.toString());
//
//
//        Animal a = new Animal();
//        a.setSpecies("Primate");
//        a.setAge(2);
//        a.makeNoise();
//
//        System.out.println(a.toString());

    }
}
