package abstractMiniExercises;

public class Blender extends Appliance {

    @Override
    public void makeSound() {
        System.out.println("~ blender sound ~");
    }

    @Override
    public void doWork() {
        System.out.println("~ blending smoothie ~");
    }
}
