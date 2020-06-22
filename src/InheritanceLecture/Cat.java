package InheritanceLecture;

public class Cat extends Animal {

    private int noOfLivesLeft;

    public Cat(String species, int age, int noOfLivesLeft){
        super(species, age);
        this.noOfLivesLeft = noOfLivesLeft;
    }

    public int getNoOfLivesLeft(){
        return noOfLivesLeft;
    }

    public void setNoOfLivesLeft(){
        this.noOfLivesLeft = noOfLivesLeft;
    }

    @Override
    public void makeNoise(){
        System.out.println("Meow meow!");
    }

}
