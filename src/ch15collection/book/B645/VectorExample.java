package ch15collection.book.B645;

import ch15collection.book.B642.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목"+i, "내용"+i,"글쓴이"+i));
                }
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목"+i, "내용"+i,"글쓴이"+i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int size = list.size();
        System.out.println("총 객체수: "+size);
        System.out.println();
    }
}


