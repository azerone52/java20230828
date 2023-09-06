package ch12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        //replace: 특정 문자열->다른 문자열로 변경

        String a = "spring";
        //replace->원본을 변화시키는게 아니라 변화한 값을 리턴해줌
        String t1 = a.replace("sp","abc");

        System.out.println(a);
        System.out.println(t1);

        String b = "java is java";
        String t2 = b.replace("java", "python");
        System.out.println(t2);

        String c = "JAVA is java";
        String t3 = c.replace("java", "python");
        System.out.println(t3);
    }
}
