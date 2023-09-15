package ch18io.book.B784;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test2.db")) {
            byte[] array = {10,20,30};

            os.write(array);

            os.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
