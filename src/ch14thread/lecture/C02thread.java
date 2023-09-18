package ch14thread.lecture;

import java.awt.*;

public class C02thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i = 0; i<5; i++){
            //소리내줌
            toolkit.beep();
            Thread.sleep(1000);
        }
        for(int i = 0; i<5; i++) {
            System.out.println("띵");
            Thread.sleep(1000);
        }
    }
}
