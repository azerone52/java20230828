package ch09nested.lecture;

public class C06localClass {
    public static void main(String[] args) {
        class LocalClass{

        }
    }
    //메소드 안에 있는 클래스를 로컬 클래스라고 생각해도 99퍼 맞음(주용법이그거라)
    public static void method1(){
        class LocalClass{

        }
    }
    public void method2(){
        class LocalCLass{

        }

        LocalCLass o1 = new LocalCLass();
    }
}
