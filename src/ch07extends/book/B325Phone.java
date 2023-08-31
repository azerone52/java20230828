package ch07extends.book;

public abstract class B325Phone {
    String owner;
    B325Phone(String owner){
        this.owner = owner;
    }

    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}
