package ch19network.lecture;

import java.io.*;
import java.net.Socket;

public class C07client {
    public static void main(String[] args) {
        //server가 client에게 파일 보내기
        try {
            Socket socket = new Socket("172.30.1.81", 5000);

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            String path = "C:/Temp/test-server.png";
            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try(socket; is; bis; fos; bos) {
                byte[] bytes = new byte[1024];
                int len = 0;

                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }

                bos.flush();

                System.out.println("클라이언트가 파일을 다 받음;)");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
