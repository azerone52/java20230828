package ch07extends.book;

public class B294ComputerExample {
    public static void main(String[] args) {
        int r=10;

        B294Calculator calculator=new B294Calculator();
        System.out.println("원 면적: "+calculator.areaCircle(r));
        System.out.println();

        B294Computer computer=new B294Computer();
        System.out.println("원 면적: "+computer.areaCircle(r));
    }
}
