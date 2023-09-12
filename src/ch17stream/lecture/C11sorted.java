package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10,35,1,52,5,2,8);

        System.out.println("가장 큰 수 출력");
        list.stream()
                .sorted((x,y)->y-x)//역순으로 정렬됨
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 작은 값 출력");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }
}
