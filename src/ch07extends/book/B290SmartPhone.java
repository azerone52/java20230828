package ch07extends.book;

public class B290SmartPhone extends B290Phone{
    public B290SmartPhone(String model, String color){
        super();
        this.model = model;
        this.color = color;
        System.out.println("B290SmartPhone(String model, String color) 생성자 실행됨");
    }
}
