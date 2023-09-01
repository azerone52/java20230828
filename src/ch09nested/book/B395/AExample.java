package ch09nested.book.B395;

public class AExample {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();
    }
}
