package ch08interface.book;

public class B342Television implements B342RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }
}
