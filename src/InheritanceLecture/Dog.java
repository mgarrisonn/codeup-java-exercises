package InheritanceLecture;

public class Dog extends Animal {


    public static void main(String[] args) {
        Dog d = new Dog();
        d.setSpecies("Canine");
        System.out.println(d.getSpecies());


    }
}
