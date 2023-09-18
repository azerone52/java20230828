package ch18io.book.B822No10;

import java.io.*;
import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        //실행하면 원본 파일 경로와 복사 파일 경로를 입력 받고
        //원본 파일을 복사하는 프로그램을 만들어보세요

        String file = "";
        String copyFile = "";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("원본 파일 경로: ");
            file = scanner.next();
            System.out.print("복사 파일 경로: ");
            copyFile = scanner.next();
        }catch (Exception e){
            e.printStackTrace();
        }

        File file1 = new File(file);
        File file2 = new File(copyFile);

        if(!file1.exists()){
            System.out.println("원본 파일이 존재하지 않습니다.");
        }
        else {
            //복사 파일 경로에서 디렉토리가 존재하지 않으면 경로상의 모든 디렉토리를 자동 생성할 것
            File path = new File(file2.getParent());
            if (!path.exists()) {
                path.mkdirs();
            }

            try (OutputStream os = new FileOutputStream(copyFile);//새 파일 만들기
                 InputStream is = new FileInputStream(file);//기존 파일 읽어오기
                 BufferedInputStream bis = new BufferedInputStream(is)//성능향상 보조 스트림
            ) {
                byte[] buf = new byte[100];
                int len = 0;
                while ((len = bis.read(buf)) != -1) {
                    os.write(buf, 0, len);
                }
                os.flush();
                System.out.println("복사가 성공되었습니다.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
