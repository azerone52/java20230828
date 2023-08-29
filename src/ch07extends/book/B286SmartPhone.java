package ch07extends.book;

public class B286SmartPhone extends B286Phone {
    public boolean wifi;
    public B286SmartPhone(String model, String color){
        this.model=model;
        this.color=color;
    }
    public void setWifi(boolean wifi){
        this.wifi=wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
