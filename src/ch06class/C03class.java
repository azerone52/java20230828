package ch06class;

public class C03class {
    public static void main(String[] args) {
        Myclass03 o1=new Myclass03();
        o1.address="seoul";

        System.out.println("o1.address = " + o1.address);
        o1=method1();
        System.out.println("o1.address = " + o1.address);
    }

    public static Myclass03 method1(){//객체 리턴값을 가짐
        Myclass03 p=new Myclass03();
        p.address ="jeju";

        return p;
    }
}

class Myclass03{
    String address;
}