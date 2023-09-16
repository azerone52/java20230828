package ch18io.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15reader {
    public static void main(String[] args) {
        String path = "C:/Temp/out7.txt";

        //문자 단위 입력 스트림
        try (Reader reader = new FileReader(path)) {
            int read = reader.read();
            char c1 = (char)read;
            int read1 = reader.read();
            int read2 = reader.read();

            System.out.println("read = " + read);//손->49552
            System.out.println("read1 = " + read1);//흥->55141
            System.out.println("read2 = " + read2);//민->48124

            System.out.println("c1 = " + c1);//손
            System.out.println("read1 = " + (char)read1);//흥
            System.out.println("(char)read2 = " + (char) read2);//민

            //손흥민이강인손흥민강인
            //위에서 이미 맨 앞의 손흥민 읽음
            char[] chars = new char[3];
            int len1 = reader.read(chars);//3
            System.out.println("chars = " + Arrays.toString(chars));//이강인
            int len2 = reader.read(chars);//3
            System.out.println("chars = " + Arrays.toString(chars));//손흥민
            int len3 = reader.read(chars);//2
            System.out.println("chars = " + Arrays.toString(chars));//강인민

            System.out.println("len1 = " + len1);//3
            System.out.println("len2 = " + len2);//3
            System.out.println("len3 = " + len3);//2

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
