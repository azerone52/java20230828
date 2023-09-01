package ch09nested.book.B399;

//import static ch09nested.book.B399.A.B;

public class AExample {
    public static void main(String[] args) {
        //B b = new B();
        A.B b = new A.B();

        System.out.println(b.field1);
        b.method1();

        //인스턴스 생성 없이 멤버 사용
        System.out.println(A.B.field2);
        A.B.method2();


        A a = new A();

        System.out.println();

        A c = new A();

        System.out.println();

        System.out.println(a.field1.field1);

        System.out.println(A.field2.field1);
        System.out.println(A.field2.field2);
    }
}
