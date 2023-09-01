package ch09nested.lecture;

public class C05acess {
    String name = "java";

    class InnerClass{
        String name = "spring";
        void method(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(C05acess.this.name);
        }
    }

    public static void main(String[] args) {
        C05acess o2 = new C05acess();
        InnerClass o1 = o2.new InnerClass();

        o1.method();
    }
}
