package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try{

        }catch (NullPointerException e){
            //동일한 예외처리코드
        }catch (ArithmeticException e){
            //동일한 예외처리코드
        }
//        NullPointerException과 ArithmeticException 모두
//        둘의 상위 타입인 RuntimeException이라고 할 수 있으므로
//        다형성에 의해 아래와 같이도 가능하다
        try {

        }catch (RuntimeException e){
            //동일한 예외처리 코드
        }
    }
}
