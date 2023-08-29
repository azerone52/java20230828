package ch06class;

public class C09static {
    public static void main(String[] args) {

    }
}
class MyClass09{
    String name;//instance field
    static String model;//static field

    void printName(){
        //인스턴스 멤버끼리 접근 가능
        System.out.println("name = " + name);
        //인스턴스 멤버에서 정적 멤버 접근 가능
        System.out.println("model = " + model);
    }
    static void printModel(){
        //정적 멤버끼리 접근 가능
        System.out.println("model = " + model);
        //정적 멤버에서 인스턴스 멤버 접근 불가능
      //  System.out.println("name = " + name);
    }
}
