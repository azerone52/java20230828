package ch08interface.book;

public class B369PromotionExample {
    public static void main(String[] args) {
        B369B b = new B369B();
        B369C c = new B369C();
        B369D d = new B369D();
        B369E e = new B369E();

        B369A a;

        a=b;
        a=c;
        a=d;
        a=e;
    }
}

