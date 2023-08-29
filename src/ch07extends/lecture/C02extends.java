package ch07extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1=new MySubClass021();
        o1.name="spring";
        o1.method3();
    }
}
//위 코드에 문법 오류가 없도록 MyClass02를 작성
class myClass02{
    String name;
    void method3(){
        System.out.println("name = " + name);
    }
}
class MySubClass021 extends myClass02{
    
}
//MyClass02: 상위 클래스, 부모 클래스, super class
//MySubClass021: 하위 클래스, 자식 클래스, sub class