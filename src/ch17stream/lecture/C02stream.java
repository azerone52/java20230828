package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {
        List<String> list = List.of("ab","de","xy");
        //Stream<String> stream = list.stream();
        //중간 연산의 리턴 타입: 스트림
       // Stream<String> stringStream = stream.map(e -> e + e);
        //최종 연산의 리턴 타입은 스트림이 아닐 수 있음
        // stream.count();

        //중간 연산의 리턴타입이 스트림이고 최종 연산에서 한번에 계산되므로
        //주로 쓰는 방식은 아래와 같음
        list.stream()
                .map(e->e+e)//중간연산
                .filter(e->e.length()>1)//중간연산
                .count();//최종연산

    }
}
