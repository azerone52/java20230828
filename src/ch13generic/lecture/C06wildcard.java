package ch13generic.lecture;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        a1=new Dog();
        a1=new Animal();
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
        //Dog는 상위클래스인 Animal이라고 할 수 있으니까
        // Animal을 타입 파라미터 값으로 갖는 객체에 Dog의 객체를 넣을 수 있을까?
//        MyClass06<Animal> o2 = o1;//이것이 안됨
//        MyClass06<Animal> o2 = new MyClass06<>();//이것도 됨
        //실제 인스턴스가 dog이므로 애니멀이 도그라고 할 수가 없어서
//        o2.set(new Animal());//이게 안되므로
//        o2.set(new Dog());//이건 되니까
//        Animal a3 = o2.get();

        //타입 파라미터가 Animal 또는 그 하위 타입 -> 가능
        MyClass06<? extends  Animal> o3 = o1;
        MyClass06<? extends  Animal> o6 = new MyClass06<Animal>();
        MyClass06<? extends  Animal> o7 = new MyClass06<Dog>();
        MyClass06<? extends  Animal> o8 = new MyClass06<Cat>();
//        MyClass06<? extends  Animal> o9 = new MyClass06<Object>();//x

        Animal ani1 = o3.get();//안전
//        o3.set(new Dog());//안전 하지 않음 왜냐면 cat이 들어올 수도 있으니까
        ani1.animalMathod();//이 메소드를 안전하게 사용하려고

        //타입 파라미터가 Animal 또는 그 상위 타입 -> 가능
        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();
//        MyClass06<? super Animal> o10 = new MyClass06<Dog>();//x
        //다형성에 의해 아래로 내려갈 수 없게 조치되어 있으므로
        // 이때는 Animal 또는 그 하위 타입으로 set 메소드를 쓸 수 있게됨
        o4.set(new Dog());
        o5.set(new Dog());
        o4.set(new Cat());
        o4.set(new Animal());
//        Animal aa = o5.get();//안전하지 않음

    }
}
class Animal {
    public void animalMathod(){}

    public void animalMethod() {
    }
}
class Dog extends Animal{}
class Cat extends Animal{}
class MyClass06<T>{
    public void set(T param){}
    public T get(){
        return null;
    }
}
