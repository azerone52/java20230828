package ch09nested.book.B423No5;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };

        action.work();

        //lamda
        Action action2 = () -> System.out.println("arrow 함수와 비슷");
        action2.work();
    }
}
