package ch07extends.book;

import java.util.Timer;

public class B316CarExample {
    public static void main(String[] args) {
        B315Car myCar = new B315Car();

        myCar.tire=new B315Tire();
        myCar.run();

        myCar.tire=new B315HankookTire();
        myCar.run();

        myCar.tire=new B315KumhoTire();
        myCar.run();
    }
}
