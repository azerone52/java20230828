package ch13generic.lecture;

public class C04generic {
    public static void main(String[] args) {
        MyClass04<String> o1 = new MyClass04<>();
        o1.setField("java");
        //형변환을 안해도 되므로 프로그램이 안전하게 작동한다는 보장이 됨
        String f1 = o1.getField();

        MyClass04<Integer> o2 = new MyClass04<>();
        o2.setField(3000);
        Integer f2 = o2.getField();
        int f22 = o2.getField();//auto unboxing

        MyClass04<Long> o3 = new MyClass04<>();
        o3.setField(5000L);
        Long f3 = o3.getField();
        long f33 = o3.getField();//auto unboxing
    }
}
class MyClass04<T>{
    private T field;

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
