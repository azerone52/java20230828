package ch08interface.book;

public class B376CarExample {
    public static void main(String[] args) {
        B376Car myCar = new B376Car();

        myCar.run();

        myCar.tire1 = new B376KumhoTire();
        myCar.tire2 = new B376KumhoTire();

        myCar.run();
    }
}
