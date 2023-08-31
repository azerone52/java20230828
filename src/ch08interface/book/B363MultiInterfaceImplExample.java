package ch08interface.book;

public class B363MultiInterfaceImplExample {
    public static void main(String[] args) {
        B363RemoteControl rc = new B363SmartTelevision();
        rc.turnOn();
        rc.turnOff();
        //B363RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
        B363Searchable searchable = new B363SmartTelevision();
        searchable.search("www.naver.com");
        //B363Searchable 인터페이스에 선언된 추상 메소드만 호출 가능

        B363SmartTelevision smartTelevision = new B363SmartTelevision();
        smartTelevision.turnOn();
        smartTelevision.search("www.daum.net");
        smartTelevision.turnOff();
        //구현된 인터페이스에 선언된 추상 메소드 전부 호출 가능
    }
}
