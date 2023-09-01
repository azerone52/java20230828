package ch09nested.lecture;

public class C07localClass {
    void method(){
        //로컬 클래스에서 사용되는
        //감싸고 있는 메소드의 지역변수 값은
        //변경할 수 없음(final, effectively final)
        int value = 0;

        class LocalClass{
            void method1(){
                System.out.println(value);
            }
        }
    }
    void method2(int param){
        //파라미터가 local class에서 사용되면
        //파라미터의 값을 변경할 수 없음.
        class LocalClass{
            void method(){
                System.out.println(param);
            }
        }
    }
}
