package ch09nested.lecture;

public class C02staticNested {
    public static void main(String[] args) {
        MyClass02.NestedClass02 o1 = new MyClass02.NestedClass02();
    }
}
class MyClass02{
    static class NestedClass02{
        //외부클래스의 인스턴스 없이 바로 접근 가능
    }
    void method1(){
        NestedClass02 o2 = new NestedClass02();
    }
}
