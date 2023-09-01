package ch08interface.book.B360;

public class ServiceExample {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        Service.staticMethod2();
    }
}
