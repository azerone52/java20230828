package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {
        //유추가 가능하면 var로 받을 수 있음
        var list = List.of(3,1,3,5,2,10,11);

        list.stream()
                .sorted()//정렬
                .forEach(System.out::println);
    }
}
