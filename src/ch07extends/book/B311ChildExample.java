package ch07extends.book;

public class B311ChildExample {
    public static void main(String[] args) {
        B311Parent parent = new B311Child();

        parent.field1="data1";
        parent.method1();
        parent.method2();

//        parent.field2="data2";//불가능
//        parent.method3();//불가능

        //강제 타입 변환
        B311Child child = (B311Child) parent;

        child.field2="data2";//가능
        child.method3();//가능
    }
}
