package ch07extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
    }
}
class MyClass03{
    private String name;

    void printName(){
        System.out.println("name = " + name);
    }
}
class MySubClass031 extends MyClass03{
    void setName(String name){
        //private 때문에 상속 받은 클래스에서 사용 불가능
      //  this.name=name;
    }
}