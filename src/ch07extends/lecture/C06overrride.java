package ch07extends.lecture;

public class C06overrride {
    public static void main(String[] args) {
        MySubClass061 o1=new MySubClass061();
        o1.method10();//자식 클래스의 메소드
    }
}
class MySubClass061 extends MyClass06{
    @Override//컴파일시 재정의한 메소드인지 검증함(부모에 없으면 빨간 줄 그어짐)
    public void method10(){
        System.out.println("자식 클래스의 메소드");
    }
}
class MyClass06{
    public void method10(){
        System.out.println("부모클래스의 메소드");
    }
}