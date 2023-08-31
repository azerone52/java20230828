package ch08interface.book.B383;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
    }

    private static void ride(Vehicle vehicle) {
        if(vehicle instanceof Bus bus){
            bus.checkFare();
        }
        vehicle.run();
    }

}
