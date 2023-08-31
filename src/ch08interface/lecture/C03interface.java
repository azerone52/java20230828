package ch08interface.lecture;

public class C03interface {
    public static void main(String[] args) {
        MyClass03 o1=new MyClass03();
        o1.method1();
        o1.method2();

        MyInterface031 i1=o1;
        MyInterface032 i2=o1;

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        i1.method1();
    }
}
interface MyInterface031{
    void method1();
}
interface MyInterface032{
    void method2();
}
//인터페이스는 하나 이상 구현 가능. 여러 인터페이스를 구현할 수 있다.
class MyClass03 implements MyInterface031, MyInterface032{
    @Override
    public void method1() {

    }
    @Override
    public void method2() {

    }
}
