package ch07extends.lecture;

public class C09polymorphism {
    public static void main(String[] args) {
        MySubClass091 o1=new MySubClass091();
        MyClass09 o2=o1;
//        String o3=o1;
//        MySubClass091 o4=new MyClass09();
        MyClass09 o3=new MyClass09();

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));

        //변수의 타입과 관계없이 실제 인스턴스의 메소드가 실행
        o1.method1();//자식메소드296
        o2.method1();//자식메소드
        o3.method1();//부모메소드
    }
}
class MyClass09{
    void method1(){
        System.out.println("부모메소드");
    }
}
class MySubClass091 extends MyClass09{
    @Override
    void method1() {
        System.out.println("자식메소드");
    }
}