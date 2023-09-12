package ch17stream.book.B771No5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lamda Expressions",
                "Java8 supports lamda expression"
        );
        list.stream()
                .filter(e->e.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
