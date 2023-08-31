package ch08interface.book;

public class B363SmartTelevision implements B363RemoteControl,B363Searchable {
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("tv를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다.");
    }
}
