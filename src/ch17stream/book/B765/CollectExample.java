package ch17stream.book.B765;

import ch17stream.book.B761.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totallist = new ArrayList<>();
        totallist.add(new Student("홍길동", "남", 92));
        totallist.add(new Student("김수영", "여", 87));
        totallist.add(new Student("김자바", "남", 95));
        totallist.add(new Student("오해영", "여", 93));

        Map<String, Double> map = totallist.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore)));

        System.out.println(map);
    }
}
