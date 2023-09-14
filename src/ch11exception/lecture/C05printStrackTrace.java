package ch11exception.lecture;

public class C05printStrackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i=0;
            int j=3/i;
            System.out.println("code2");
        }catch (ArithmeticException e){
            // 어떤 오류가 발생했는지 알려주는 코드
            // try~catch 쓸 때 catch 문을 쓸 때
            // 안에 뭘 써야할지 모르겠으면 쓰기
            e.printStackTrace();
        }

        System.out.println("code3");
    }
}
