package ch16lamda.lecture;

public class C05return {
    public static void main(String[] args) {
        MyInterface05 o1 = ()->{
            System.out.println("명령문1");
            System.out.println("명령문2");
            return 0;
        };
        //void가 아닌 메소드에서는 return 키워드까지 생략해야 한 줄 작성 가능
        MyInterface05 o2 = ()-> 0;
    }
}
@FunctionalInterface
interface MyInterface05{
    int method();
}

class MyClass05 implements MyInterface05{
    @Override
    public int method() {
        return 0;
    }
}
