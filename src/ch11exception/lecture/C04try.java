package ch11exception.lecture;

public class C04try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code3");
            System.out.println("code4");
        }catch (ArithmeticException e){
            System.out.println("code1");
            System.out.println("code2");
        }
        System.out.println("code5");
    }
}
