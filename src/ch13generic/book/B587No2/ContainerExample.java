package ch13generic.book.B587No2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<>();
        container2.set(6);
        int value = container2.get();
    }
}
class Container<T>{
    private T field;

    public void set(T field) {
        this.field = field;
    }

    public T get() {
        return field;
    }
}
