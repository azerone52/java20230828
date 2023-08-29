package ch07extends.book;

public class B296SupersonicAirplaneExample {
    public static void main(String[] args) {
        B296SupersonicAirplane superSonicAirplane=new B296SupersonicAirplane();
        superSonicAirplane.takeOff();
        superSonicAirplane.fly();
        superSonicAirplane.flyMode=B296SupersonicAirplane.SUPERSONIC;
        superSonicAirplane.fly();
        superSonicAirplane.flyMode=B296SupersonicAirplane.NORMAL;
        superSonicAirplane.fly();
        superSonicAirplane.land();
    }
}
