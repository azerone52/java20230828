package ch08interface.book;

public class B342RemoteControlExample {
    public static void main(String[] args) {
        B342RemoteControl rc;
        rc = new B342Television();
        rc.turnOn();

        rc = new B342Audio();
        rc.turnOn();
    }
}
