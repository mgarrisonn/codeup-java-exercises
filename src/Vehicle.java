public class Vehicle {
//    -- !! MINI-EXERCISE 1 !!
//    Create a Vehicle class:
//  - add the following private properties:
//    1. boolean isOperable (intended to describe if the vehicle is functional or broken)
//    2. int passengerCapacity (intended to describe how many people it can transport)
//    3. String powerSource (intended to describe how the vehicle is powered, e.g. "gas", "electric", "nuclear", "human-effort", etc.)
//  - add getters and setters for all properties, an empty constructor, and a constructor that sets all fields
//    Create a Car class that extends Vehicle (no need to add anything to it yet)
//    Create a Jet class that extends Vehicle (no need to add anything to it yet)
//    Create a VehicleTest class
//  - add a main method and create a Vehicle, Jet, and Car object, setting values for each and testing out the output of .toString() method for each

//    -- !! MINI-EXERCISE 2 !!
//    In your Car class, add the following:
//  - private int property for milesPerGallon
//  - a constructor that calls the vehicle constructor to set all of the inherited fields and sets the milesPerGallon
//  - add getters and setters for milesPerGallon
//  - add a void deployAirBag() that will sout a message "Deploying airbag..."
//  - add a .toString() method with IntelliJ
//
//    In your Jet class, add the following:
//  - private int property for maximumAltitude
//  - add a void method takeOff() that will sout a message "Taking off..."
//  - a constructor that calls the vehicle constructor to set all of the inherited fields and sets the maximumAltitude
//  - add getters and setters for maximumAltitude
//  - add a .toString() method with IntelliJ

    //    -- !! MINI-EXERCISE 3 !!
//    In your Vehicle class, experiment with changing the visibility of the three instance properties to see how they are directly accessible or not through the Jet and Car objects.
//    Add a separate package for for the Vehicle class called vehicle and add a separate package for the Jet and Car classes called jetCar.
//    Experiment with package private visibility and protected visibility of properties in the vehicle class and see if you can determine how it works in the jetCar package.
//    After experimenting with visibility, change the vehicle property visibility to private, move the Vehicle, Jet, and Car classes back out directly into src, and delete the vehicle and jetCar packages.


//    -- !! MINI-EXERCISE 4 !!
//    In your Vehicle class, add a void method, turnOn(), that prints the message "Vehicle is turning on...".
//    In your Jet class, override the turnOn() method to print the message "Igniting jet engines..."
//    In your Car class, override the turnOn() method to print the message "Cranking engine..."
//    In our vehicle test class, add a method, turn on vehicles, that takes in an array of vehicles and invokes the turnOn() method for all of them.

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

//    public Vehicle(){
//
//    }

    public void turnOn(){
        System.out.println("Vehicle is turning on...");
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
