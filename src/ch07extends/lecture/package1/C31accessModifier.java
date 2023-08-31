package ch07extends.lecture.package1;

//다른 패키지에 있으므로 import
import ch07extends.lecture.MyClass30;

public class C31accessModifier extends MyClass30{
    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();

        //o1.privateMethod();
        o1.publicMethod();
        //o1.packagePrivateMethod();
        //o1.protectedMethod();
    }
}
