package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("code1");
        //업무흐름을 1초만큼 멈춰라
        Thread.sleep(1000);
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}
