public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setOperable(true);
        v.setPassengerCapacity(123);
        v.setPowerSource("Steam engine");

        Car c = new Car();
        c.setOperable(true);
        c.setPassengerCapacity(4);
        c.setPowerSource("v6");

        Jet j = new Jet();
        j.setOperable(true);
        j.setPassengerCapacity(2);
        j.setPowerSource("Rocket propelled");

        System.out.println(v.toString());
        System.out.println("====================");
        System.out.println(c.toString());
        System.out.println("====================");
        System.out.println(j.toString());

    }
}
