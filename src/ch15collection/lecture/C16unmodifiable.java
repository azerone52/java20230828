package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C16unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("html");

        list.remove(1);

        //수정 불가 list 만들기
        List<String> list1 = List.of("java", "react", "css");
//        list1.add("python");

        System.out.println("프로그램 진행중...");
    }
}
