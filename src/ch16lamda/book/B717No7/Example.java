package ch16lamda.book.B717No7;

import ch16lamda.book.B704.Person;

@FunctionalInterface
interface Operator{
    public int apply(int x, int y);
}
public class Example {
    private static int[] scores = {10,50,3};

    public static int maxOrMin(Operator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.apply(result, score);
        }
        //삼항연산자
        //result = (result<score) ? score : result;
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((x, y) -> {
           if(x<y){
               x=y;
           }

           return x;
        });
        System.out.println("max = " + max);

        int min = maxOrMin((x, y) -> {
           if(x>y){
               x=y;
           }
           return x;
        });
        System.out.println("min = " + min);
    }
}
