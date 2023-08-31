package ch07extends.book;

import java.sql.Driver;

public class B318DriverExample {
    public static void main(String[] args) {
        B318Driver dirver = new B318Driver();

        B318Bus bus = new B318Bus();
        dirver.drive(bus);

        B318Taxi taxi = new B318Taxi();
        dirver.drive(taxi);
    }
}
