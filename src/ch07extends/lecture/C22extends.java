package ch07extends.lecture;

public class C22extends {
    public static void main(String[] args) {
        MySubClass22 o1 = new MySubClass22();
    }
}
class MyClass22{
    MyClass22(){
        //초기화하는 코드들 작성됨...

        System.out.println("상위 클래스 초기화 코드들...");
    }
}
class MySubClass22 extends MyClass22{
    MySubClass22(){
        //상위 클래스 생성자 호출(초기화 하는 코드 실행)
        super();
        //가장 위에 꼭 있어야 함
        //안쓰면 자동 삽입

        //MysubClass22 인스턴스 필드 초기화 코드들...

        System.out.println("하위 클래스 초기화 코드");
    }
}
