package ch11exception.book.B468;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try{
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("프로그램은 계속됩니다.");
    }
}
