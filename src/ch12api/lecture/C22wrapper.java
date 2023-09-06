package ch12api.lecture;

public class C22wrapper {
    public static void main(String[] args) {
        Integer i = 30;
        Integer j = 30;

        int k = 30;
        int l = 30;

        System.out.println(k==l);
        System.out.println(i==j);

        System.out.println("System.identityHashCode(i) = " + System.identityHashCode(i));
        System.out.println("System.identityHashCode(j) = " + System.identityHashCode(j));

    }
}
