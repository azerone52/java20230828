package ch16lamda.book.B704;

import java.util.Collections;
import java.util.List;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x,y)->{
            double result = x+y;
            return result;
        });

        person.action((x, y) -> (x+y));

        person.action((x, y) -> sum(x,y));
        person.action(LamdaExample::sum);


        Calculable calculable = (a, b)->a+b;
        double c = calculable.calc(10,20);
        System.out.println(c);

        List<Integer> list = List.of(3, 4, 9, 10, 11, 23);

        int sum = list.stream().filter(e -> e % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum = " + sum);

        int sum1 = list.stream().filter(e -> e % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum1 = " + sum1);
    }

    public static double sum(double x, double y){
        return (x+y);
    }
}
