package ch08interface.book;

public class B342Audio implements B342RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
}
