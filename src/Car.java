public class Car extends Vehicle {

    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon){
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon(){
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void deployAirBag(){
        System.out.println("Deploying airbag...");
    }

    public void deployingAirBag(String air){
        System.out.println(air);
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                '}';
    }
}
