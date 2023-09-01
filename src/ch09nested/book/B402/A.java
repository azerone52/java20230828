package ch09nested.book.B402;

public class A {
    A(){
        class B{
            B(){
                System.out.println("나는 생성자1");
            }
        }

        B b = new B();
    }

    void method(){
        class B{
            B(){
                System.out.println("나는 생성자2");
            }
        }

        B b = new B();
    }

    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}
