package ch17stream.lecture;

import java.util.List;
import java.util.Optional;

public class C17optional {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,2);
        Optional<Integer> sum = list.stream()
                .reduce(Integer::sum);

        //list에 값이 없었을 시 오류나는 문장
        Integer value = sum.get();
        System.out.println("value = " + value);

        System.out.println("sum = " + sum);
        System.out.println("sum.orElse(0) = " + sum.orElse(0));
        System.out.println("프로그램 실행중...");
    }
}
