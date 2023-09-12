package ch17stream.lecture;

import java.util.List;
import java.util.Optional;

public class C16reduce {
    public static void main(String[] args) {
        var list = List.of(3,4,1);

        Integer max = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max = " + max);

        //초기값이 방해됨(list가 없어서 값을 낼 수 없다면 값이 없게 하고 싶음)
        List<Integer> list2 = List.of();
        Integer max2 = list2.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max2 = " + max2);

        //Optional<T>를 리턴하는 reduce(메소드 오버로딩)
        List<Integer> list3 = List.of(5,2);
        Optional<Integer> max3 = list3.stream()
                .reduce(Math::max);
        System.out.println("max3 = " + max3);
    }
}
