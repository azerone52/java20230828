package ch07extends.book.package2;

import ch07extends.book.B302A;

public class B302D extends B302A {
    public B302D(){
        super();
    }
    public void method(){
        this.field="value";
        this.method();
    }
    //직접 A 객체를 생성해서 사용하는 것은 안됨
//    public void method2(){
//        B302A a = new B302A();
//        a.field="value";
//    }
}
