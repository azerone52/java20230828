package ch07extends.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        Malamute12 dog = new Malamute12();
        dog.breath();
        dog.sniff();

        Animal12 ani = dog;
        ani.breath();
        //ani.sniff();
        //자식 클래스의 객체를 가져도 부모 클래스에 없는 멤버는 실행이 안됨


    }
}
class Animal12{
    public void breath(){
        System.out.println("숨쉬다.");
    }
}
class Malamute12 extends Animal12{
    public void sniff(){
        System.out.println("냄새를 맡다");
    }
}