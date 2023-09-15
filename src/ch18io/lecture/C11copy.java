package ch18io.lecture;

import java.io.*;

public class C11copy {
    //B791 try 버전
    public static void main(String[] args) {
        String src = "C:/Temp/test.png";
        String des = "C:/Temp/test3.png";

        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(des)) {

            byte[] buf = new byte[1024];

            int len = 0;
            while ((len = is.read(buf))!=-1){
                os.write(buf, 0, len);
            }
            os.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
