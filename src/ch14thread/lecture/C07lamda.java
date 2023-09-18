package ch14thread.lecture;

import java.awt.*;

public class C07lamda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            Toolkit t1 = Toolkit.getDefaultToolkit();
            for(int i=0; i<3; i++){
                t1.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(()->{
            for(int i=0; i<3; i++){
                System.out.println("띵");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();
    }
}
