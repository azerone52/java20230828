package ch08interface.book;

public class B376Car {
    B376Tire tire1 = new B376HankookTire();
    B376Tire tire2 = new B376HankookTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}
