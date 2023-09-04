package ch16lamda.lecture;

public class C02lamda {
    public static void main(String[] args) {
        //lamda
        //(파라미터 목록)->{메소드 몸통}
        MyInterface02 o1 = ()->{
            System.out.println("C02lamda.main");
        };
        o1.method();

        //메소드 몸통의 코드가 한 줄이면 중괄호 생략 가능
        MyInterface02 o2 = ()-> System.out.println("메소드 내 코드가 한 줄");

        o2.method();
    }
}
@FunctionalInterface
interface MyInterface02{
    //파라미터 없는 메소드
    //리턴 없음
    void method();
}
