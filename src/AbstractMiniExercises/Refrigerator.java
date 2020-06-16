package abstractMiniExercises;

public class Refrigerator extends Appliance {

    public Refrigerator(String brand, String color){
        super(brand, color);
    }

    @Override
    public void makeSound(){
        System.out.println("Beep beep beep");
    }

    @Override
    public void doWork(){
        System.out.println("~ keep it chill ~");
    }
}
