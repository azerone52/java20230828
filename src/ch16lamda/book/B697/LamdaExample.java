package ch16lamda.book.B697;

public class LamdaExample {
    public static void main(String[] args) {
        action((x,y) -> {
            int result = x+y;
            System.out.println("result: "+ result);
        });

        action((x,y)->{
            int result = x-y;
            System.out.println("result = " + result);
        });
    }
    public static void action(Calculable calculable){
        int x =10;
        int y = 4;

        calculable.calculatate(x,y);
    }
}
