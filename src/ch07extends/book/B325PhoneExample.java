package ch07extends.book;

public class B325PhoneExample {
    public static void main(String[] args) {
       // B325Phone phone = new B325Phone(); //안됨
        B325SmartPhone smartPhone = new B325SmartPhone("홍길동");

        smartPhone.turnOn();//Phone의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
