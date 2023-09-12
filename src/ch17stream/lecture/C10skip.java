package ch17stream.lecture;

import java.util.List;

public class C10skip {
    public static void main(String[] args) {
        var list = List.of(10,9,1,5,2,3);
        list.stream()
                .skip(3)//몇개를 스킵할 것인지
                .forEach(System.out::println);

        System.out.println("가장 작은 값 출력");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 큰 값 출력");
        list.stream()
                .sorted()
                .skip(list.size()-1)
                .forEach(System.out::println);

        System.out.println("가장 마지막 원소 출력");
        list.stream()
                .skip(list.size()-1)
                .sorted()
                .forEach(System.out::println);
    }
}
