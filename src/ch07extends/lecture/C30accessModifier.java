package ch07extends.lecture;

public class C30accessModifier {
    public static void main(String[] args) {
        //접근지정자, 접근제한자(access modifier)
        //public : 가장 넓은 범위, 어디서든지 접근 가능
        //protected : 같은 패키지내, 다른 패키지에 있는 상속한(자식) 클래스에서 접근 가능
        //(package private, default) : 같은 패키지내에서만 접근 가능
        //private : 가장 좁은 범위, 클래스 내에서만 접근 가능

        MyClass30 o1 = new MyClass30();
        o1.publicMethod();
//        private 멤버(필드, 생성자, 메소드) 접근 불가능
//        o1.privateMethod();
        o1.packagePrivateMethod();
        o1.protectedMethod();
    }
}

