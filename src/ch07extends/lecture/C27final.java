package ch07extends.lecture;

public class C27final {
    public static void main(String[] args) {
        //final변수: 값을 한 번만 할당 할 수 있음
        final int a = 3;
    }
}
class MyClass27{
    final int age = 3;//잘 안씀
    final String name;//자주씀1
    MyClass27(){
        this.name="java";//자주씀2
    }
}