package ch18io.lecture;

import java.io.*;

public class C18filter {
    public static void main(String[] args) {
        //보조스트림 (filter stream)
        // : 다른 스트림을 변환하는 스트림

        try {
            OutputStream os = getOutputStream("C:/Temp/out8.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            try(os; osw) {
                osw.write('손');
                osw.write('흥');
                osw.write('민');

                osw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static OutputStream getOutputStream(String file) throws FileNotFoundException{
        OutputStream os = new FileOutputStream(file);
        return os;
    }
}
