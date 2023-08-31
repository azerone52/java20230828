package ch07extends.lecture;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();

        Animal26 a2 = new Fish26();
        a2.breath();
    }
}
//추상메소드를 가진 클래스는 꼭 추상 클래스가 되어야 함
abstract class Animal26{
//    public void breath(){
//        System.out.println("폐 또는 아가미로 숨 쉽니다.");
//    }
    //추상 메소드: 몸통이 없는 메소드
    //기능이 없고 메소드 명만 가지고 있음
    abstract public void breath();
}
// 추상메소드를 꼭 재정의(오버라이드) 해야함
//그래야 추상클래스가 아닌 일반 클래스를 만들 수 있음
class Dog26 extends Animal26{
    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}
class Fish26 extends Animal26{
    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}
