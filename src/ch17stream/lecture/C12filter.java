package ch17stream.lecture;

import java.util.List;

public class C12filter {
    public static void main(String[] args) {
        var list = List.of(3,1,5,7,10,32,2);

        System.out.println("짝수 중 가장 작은 값만 출력");
        list.stream()
                .filter(e->e%2==0)//boolean값을 받아 true면 다음 값이 나오게 해줌
                .sorted()
                .limit(1)
                .forEach(System.out::println);
        System.out.println("홀수 중 가장 큰 값만 출력");
        list.stream()
                .filter(e->e%2==1)
                .sorted((x,y)->y-x)
                .limit(1)
                .forEach(System.out::println);
    }
}
