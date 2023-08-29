package ch07extends.book;

public class B308ChildExample {
    public static void main(String[] args) {
        B308Child child = new B308Child();
        //자동 타입 변환
        B308Parent parent = child;

        child.method1();
        child.method2();
        child.method3();

        parent.method1();
        parent.method2();
//        parent.method3();//호출 불가능
    }
}
