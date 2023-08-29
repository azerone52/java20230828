package ch06class;

public class C10capsule {
    public static void main(String[] args) {

    }
}
class MyClass10{
    //특별한 일이 없으면 필드에 private 붙여주기
    // 관련된 메소드는 public 붙여주기 (주로 getter, setter)
    private int age;
    private String name;

    //인스턴스 필드의 값을 변경할 메소드
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}