package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface {
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
                System.out.println("나는 메인메소드에 포함");
            }
        }
        ConcreteClass c = new ConcreteClass();
        c.method2();

        MyClass08 myClass08 = new MyClass08();
        myClass08.method1();
    }
}

class MyClass081 implements MyClass08.NestedInterface {
    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}

class MyClass08 {
    interface NestedInterface {
        //중첩인터페이스에 올 수 있는 것들
        // public final static field
        // public abstract instance method (***********)
        void method2();
        // private instance method
        // default instance method
        // public static method
        // private static method
    }

    void method1() {
        class ConcreteClass implements NestedInterface {
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
                System.out.println("나는 method01에 포함");
            }
        }

        ConcreteClass c = new ConcreteClass();
        c.method2();

    }
}
