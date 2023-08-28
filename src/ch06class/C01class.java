package ch06class;

public class C01class {
    public static void main(String[] args) {
        Myclass01 o1 = new Myclass01();
        System.out.println("System.identityHashCode(o1) = " + System.identityHashCode(o1));

        System.out.println("o1.age = " + o1.age);

        o1.age=30;

        System.out.println("o1.age = " + o1.age);

        Myclass01 o2=o1;

        System.out.println("System.identityHashCode(o2) = " + System.identityHashCode(o2));
        System.out.println("o2.age = " + o2.age);
    }
}

class Myclass01{
    //instance fields
    //인스턴스가 가져야 하는 속성들
    int age;

    //instance methods
    //인스턴스가 가져야 하는 기능들
    
    
    
}
