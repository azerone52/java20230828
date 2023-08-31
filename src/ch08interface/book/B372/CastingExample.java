package ch08interface.book.B372;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus)vehicle;
        bus.run();
        bus.checkFare();
    }
}
