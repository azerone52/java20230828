package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1(){
        //기존의 파일스트림 예외처리 try-catch 방식
        OutputStream os = null;//finally 블럭에서도 쓰기 위해 밖에서 선언
        try {
            os = new FileOutputStream("");//안에서 객체 부여
            os.write(110);
            os.write(111);
            os.write(112);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                os.close();//ioStream 꼭 닫아야 함->finally
                //checked exception 예외처리 해줘야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method2(){
        //try-with-resource 문법
        //변수의 타입은 AutoCloseable이어야 함
        try(OutputStream os = new FileOutputStream("")) {
            os.write(33);
            os.write(67);
            //os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void method3(){
        try(
            FileOutputStream fos = new FileOutputStream("");
            FileInputStream fis = new FileInputStream("");
        ){
            fos.write(234);
            fis.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void method4(){
        //값이 한번만 할당 됐을 때는 try() 안에 변수명만 써도 됨
        Scanner scanner = new Scanner("");
        try (scanner) {
            scanner.hasNext();
            scanner.next();
        }
    }
    public void method5(){
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try(fio; fos) {
                fio.read();
                fos.write(33);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void method6() throws IOException {
        // 안좋은 코드임...
        //76~80라인 모두 exception이 발생할 수 있는 코드인데
        //throws 를 사용하면 중간에 실행이 멈추고 끝나므로
        //꼭 써줘야 하는 close를 못하고 끝나므로
        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }
}

