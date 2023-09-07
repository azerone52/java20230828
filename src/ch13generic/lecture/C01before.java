package ch13generic.lecture;

public class C01before {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.setA("java");

        MyClass01 o2 =new MyClass01();
        o2.setA(3);

        MyClass01 o3 = new MyClass01();
        o3.setA(true);

        Object f1 = o1.getA();
        Object f2 = o2.getA();
        Object f3 = o3.getA();

        //각 자료형만의 메소드를 사용하려면 형변환을 해야함
        String g1 = (String)f1;
        Integer g2 = (Integer)f2;
        Boolean g3 = (Boolean)f3;

        Long g4 = (Long)f2;//실행시에 오류 발생(Integer != Long)
    }
}
class MyClass01{
    private Object a;

    public void setA(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }
}
