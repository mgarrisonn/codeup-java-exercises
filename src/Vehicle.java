public class Vehicle {
//    -- !! MINI-EXERCISE 1 !!
//    Create a Vehicle class:
//            - add the following private properties:
//            1. boolean isOperable (intended to describe if the vehicle is functional or broken)
//    2. int passengerCapacity (intended to describe how many people it can transport)
//    3. String powerSource (intended to describe how the vehicle is powered, e.g. "gas", "electric", "nuclear", "human-effort", etc.)
//  - add getters and setters for all properties, an empty constructor, and a constructor that sets all fields
//    Create a Car class that extends Vehicle (no need to add anything to it yet)
//    Create a Jet class that extends Vehicle (no need to add anything to it yet)
//    Create a VehicleTest class
//  - add a main method and create a Vehicle, Jet, and Car object, setting values for each and testing out the output of .toString() method for each

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public Vehicle(){

    }

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource){
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public boolean getOperable(){
        return isOperable;
    }
    public void setOperable(boolean isOperable){
        this.isOperable = isOperable;
    }

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource(){
        return powerSource;
    }

    public void setPowerSource(String powerSource){
        this.powerSource = powerSource;
    }

    public String toString(){
        return "Operable: " + this.isOperable + "\nCapacity: " + this.passengerCapacity + "\nPower Source: " + this.powerSource;
    }

}
