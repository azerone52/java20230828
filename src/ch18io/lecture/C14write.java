package ch18io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C14write {
    public static void main(String[] args) {
        String file = "C:/Temp/out7.txt";
        try (Writer writer = new FileWriter(file)) {
            char[] chars = {'손', '흥', '민', '이', '강', '인'};
            writer.write(chars);
            //0번째인덱스부터3개
            writer.write(chars, 0, 3);
            //4번째인덱스부터2개
            writer.write(chars, 4, 2);
            //결과: 손흥민이강인손흥민강인
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
