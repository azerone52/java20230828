package ch09nested.book.B417;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();

        home.use1();
        home.use2();

        home.use3(new RemoteControl(){
            public void turnOn(){
                System.out.println("난방을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("난반능 끕니다.");
            }
        });
    }
}
