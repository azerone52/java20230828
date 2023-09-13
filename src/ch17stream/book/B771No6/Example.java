package ch17stream.book.B771No6;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        var list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );
        //멤버의 나이들 출력
        list.stream()
                .map(e->e.getAge())
                .forEach(System.out::println);

        //평균 나이 구하기
        double avg = (list.stream()
                .map(e->e.getAge())
                .reduce(0, (x,y)->x+y))/ list.size();
        System.out.println("avg = " + avg);


        double avg2 = list.stream()
                .mapToDouble(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("avg2 = " + avg2);


        System.out.println("가장 많은 나이를 reduce로 구해서 출력");
        Integer max = list.stream()
                .map(e -> e.getAge())
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max = " + max);

        System.out.println("가장 작은 나이를 reduce로 구해서 출력");
        Integer min = list.stream()
                .map(e -> e.getAge())
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("min = " + min);

    }
}
