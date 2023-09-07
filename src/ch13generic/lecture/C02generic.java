package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        //객체를 생성할 때 타입을 결정
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
//        MyClass02<int> o5 = new MyClass02<int>();//기본타입 x

        MyClass02<Object> o6 = new MyClass02<>();//뒤에 타입 작성은 생략 가능

    }
}
//generic type
class MyClass02<T>{
    //private Object a;
    //타입을 object로도 두지 말고 뭉뜽그린 타입으로 두자
    private T a;
}
