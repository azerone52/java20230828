package ch06class;

public class C06string {
    public static void main(String[] args) {
        String a="java";
        String b="spring";

        //셋 다 같은 객체라 같은 참조값을 가짐
        System.out.println(a.CASE_INSENSITIVE_ORDER);
        System.out.println(b.CASE_INSENSITIVE_ORDER);
        System.out.println(String.CASE_INSENSITIVE_ORDER);

        System.out.println(a.length());
        System.out.println(b.length());

        System.out.println(String.valueOf(30));
    }
}