package InheritanceLecture;

public class Dog extends Animal {

    private String breed;
    private String name;
    private String nameOfOwner;

    public void soutProtectedProp(){
        System.out.println(protectedProp);
    }

//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.setSpecies("Canine");
//        System.out.println(d.getSpecies());
//    }

    // Can add different constructor if constructor not called in Animal class
    public Dog(String species, int age, String breed, String name, String nameOfOwner){
        super(species, age);
        this.breed = breed;
        this.name = name;
        this.nameOfOwner = nameOfOwner;
    }

    public String getBreed(){
        return breed;
    }

    public void fetchBall(){
        System.out.println("Dog is fetching the ball....");
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getNameOfOwner(){
        return nameOfOwner;
    }

    public void setNameOfOwner(){
        this.nameOfOwner = nameOfOwner;
    }


    @Override // method overriding
    public void makeNoise(){
        System.out.println("Bark bark bark!!!");
    }
    // method overloading
    public void makeNoise(String noise){
        System.out.println(noise);
    }

    public void makeGenericAnimalNoise(){
        super.makeNoise();
    }

    public String toString(){
        return "Species: " + this.getSpecies() + "\nAge: " + this.getAge() + "\nBreed: " + this.getBreed() + "\nName: " + this.name + "\nName of Owner: " + this.nameOfOwner;

    }



}
