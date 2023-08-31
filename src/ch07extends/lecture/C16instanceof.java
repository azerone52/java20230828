package ch07extends.lecture;

public class C16instanceof {
    public static void main(String[] args) {
        Animal16 ani1 = new Dog16();
        Animal16 ani2 = new Cat16();
        Animal16 ani3 = new Animal16();

        //instanceof 연산자
        //연산결과: true false (boolean)
        //좌변: 참조변수   우변: 타입
        System.out.println("ani1 instanceof Animal16 = " + (ani1 instanceof Animal16));
        //ani1가 가리키는 인스턴스가 Animal16타입인가
        System.out.println("ani1 instanceof Dog16 = "+ (ani1 instanceof Dog16));
        System.out.println("ani1 instanceof Cat16 = "+ (ani1 instanceof Cat16));

        System.out.println();

        System.out.println("ani2 instanceof Animal16 = " + (ani2 instanceof Animal16));
        System.out.println("ani2 instanceof Dog16 = " + (ani2 instanceof Dog16));
        System.out.println("ani2 instanceof Cat16 = "+ (ani2 instanceof Cat16));

        System.out.println();

        System.out.println("ani3 instanceof Animal16 = " + (ani3 instanceof Animal16));
        System.out.println("ani3 instanceof Dog16 = " + (ani3 instanceof Dog16));
        System.out.println("ani3 instanceof Cat16 = "+ (ani3 instanceof Cat16));
    }
}

class Animal16{}
class Dog16 extends Animal16{}
class Cat16 extends Animal16{}
