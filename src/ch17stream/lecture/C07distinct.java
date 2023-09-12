package ch17stream.lecture;

import java.util.List;

public class C07distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,4,5,2,5,2,3,7);//9개
        long count = list.stream()
                .distinct()//중복 제거
                .count();

        System.out.println("count = " + count);
    }
}
