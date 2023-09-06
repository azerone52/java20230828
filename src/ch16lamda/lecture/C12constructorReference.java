package ch16lamda.lecture;

import java.util.stream.IntStream;

public class C12constructorReference {
    public static void main(String[] args) {
        System.out.println("for문 사용");

        for (int i = 1; i < 10; i++) {
            //한번 쓰고 버릴 녀석이니까 가능함
            Student s = new Student(i);
//            s = new Student(3); //가능
            System.out.println(s.toString());
            System.out.println(s);
            System.out.println("System.identityHashCode(s) = " + System.identityHashCode(s));
        }


        System.out.println("stream 사용");
        IntStream.range(1, 10)
                .mapToObj(Student::new)
                .forEach(System.out::println);
    }
}

class Student {
    private int number;

    Student(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                '}';
    }
}
