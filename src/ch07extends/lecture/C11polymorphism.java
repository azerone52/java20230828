package ch07extends.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        String t = new String("java");
        String x = "java";//문자열 내용이 똑같은 경우 new String을 사용하지 않으면 같은 객체로 처리됨

//        String t=o;
        int v1 = s.hashCode();
        int v2 = s.hashCode();
        int v3 = t.hashCode();
        int v4 = x.hashCode();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(o));
        System.out.println(System.identityHashCode(t));
        System.out.println(System.identityHashCode(x));
    }
}
