package ch18io.book.B821No7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String filepath = "src/ch18io/book/B821No7/Example.java";

        try (FileReader fr = new FileReader(filepath);
             BufferedReader br = new BufferedReader(fr)) {

            int rowNumber = 0;
            String rowData;
            while (true){
                rowNumber++;
                rowData = br.readLine();
                if(rowData==null){
                    break;
                }
                //아래쪽에 있어야 break가 먼저 되어서 null 문자 출력 안함
                System.out.printf("%d: %s\n", rowNumber, rowData);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
