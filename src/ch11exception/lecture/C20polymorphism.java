package ch11exception.lecture;

public class C20polymorphism {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ReflectiveOperationException e) {
            e.getStackTrace();
        }
    }
    public static void method1() throws ReflectiveOperationException{
        method2();
    }
    public static void method2() throws ClassNotFoundException{

    }
}
