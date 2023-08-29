package ch07extends.book;

public class B286SmartPhoneExample {
    public static void main(String[] args) {
        B286SmartPhone myPhone = new B286SmartPhone("갤럭시","은색");

        System.out.println("모델: "+myPhone.model);
        System.out.println("색상: "+myPhone.color);

        System.out.println("와이파이 상태: "+myPhone.wifi);

        //phone 상속 메소드
        myPhone.bell();

        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
        myPhone.sendVoice("아~ 네 반갑습니다");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
