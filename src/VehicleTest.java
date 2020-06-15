public class VehicleTest {

    public static void vehicleTurningOn(Vehicle[] vehicles){
        for (Vehicle v: vehicles){
            v.turnOn();
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(true, 123, "Steam engine");
        v.setOperable(true);
        v.setPassengerCapacity(123);
        v.setPowerSource("Steam engine");

        Car c = new Car(true,  2, "Rocket Propelled", 24);
        c.setOperable(true);
        c.setPassengerCapacity(4);
        c.setPowerSource("v6");

        Jet j = new Jet(true, 2, "Rocket propelled", 3000);
        j.setOperable(true);
        j.setPassengerCapacity(2);
        j.setPowerSource("Rocket propelled");

        System.out.println(v.toString());
        System.out.println("====================");
        System.out.println(c.toString());
        System.out.println("====================");
        System.out.println(j.toString());


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = v;
        vehicles[1] = c;
        vehicles[2] = j;


        Car car = (Car) vehicles[1];
        car.turnOn();

        Jet jet = (Jet) vehicles[2];
        jet.turnOn();

        vehicleTurningOn(vehicles);

    }
}
