package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
            //ClassCastException
            //NullPointerException
            //ArithmeticException
        }catch(ClassCastException e){
            //ClassCastException
            //예외처리
        }catch (RuntimeException e){
            //NullPointerException
            //ArithmeticException
            //예외처리
        }
    }
}
