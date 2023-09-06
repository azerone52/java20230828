package ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        //replaceAll: 특정 패턴->다른 문자열로 변경
        String a = "JAVA is java";
        String r = a.replace("java", "python");
        System.out.println(r);

        String rA = a.replaceAll("(java|JAVA)", "C");
        System.out.println(rA);
    }
}
