package ch18io.lecture;

import java.io.*;

public class C17copy {
    public static void main(String[] args) {
        //바이트 단위는 문자도 그림도 다 가능하다.
        String src = "src/ch18io/lecture/C17copy.java";
        String des = "C:/Temp/C17copy.java";

        try {
            InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des);
            //중간에 한글이 있어도...
            try(is; os) {
                byte[] buf = new byte[100];
                int len = 0;
                while ((len=is.read(buf))!=-1){
                    os.write(buf, 0, len);
                }
            }
            os.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
