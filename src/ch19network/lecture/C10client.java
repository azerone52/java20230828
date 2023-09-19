package ch19network.lecture;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.23", 7000);

            Scanner scanner = new Scanner(System.in);

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(writer);

            try (socket;scanner; os; writer; bw) {
                    while(true) {
                        String msg = scanner.nextLine();
                        System.out.println(msg);
                        bw.write(msg);
//                        bw.newLine();
                        bw.flush();
                        if (msg.equals("bye")) break;
                    }
                }
            }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
