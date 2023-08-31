package ch08interface.lecture;

public class C08cast {
    public static void main(String[] args) {
        MyInterface08 i1 = new MyClass081();
        i1.method();

//        i1.otherMethod();//x
        //꼭 쓰고 싶으면 강제 형변환을 통해서 사용
        MyClass081 o1 = (MyClass081) i1;
        o1.overMethod();
    }
}
interface MyInterface08{
    void method();
}
class MyClass081 implements MyInterface08{
    @Override
    public void method() {
        System.out.println("재정의한 메소드");
    }
    public void overMethod(){
        System.out.println("MyClass081.overMethod");
    }
}
