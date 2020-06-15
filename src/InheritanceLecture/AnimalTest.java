package InheritanceLecture;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setAge(3);
        a.setSpecies("Primate");

        Dog d = new Dog();
        d.setSpecies("Canine");
        d.setAge(7);

        Cat c = new Cat();
        c.setSpecies("Feline");
        c.setAge(2);

//        a.makeNoise();
//        d.makeNoise();
//        c.makeNoise();

        System.out.println(a.printSummary());
        System.out.println("=================");
        System.out.println(d.printSummary());
        System.out.println("=================");
        System.out.println(c.printSummary());


        System.out.println(a.toString());
        System.out.println("=================");
        System.out.println(d.toString());
        System.out.println("=================");
        System.out.println(c.toString());



    }
}
