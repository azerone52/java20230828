package ch07extends.book;

public class B329AbstractMethodExample {
    public static void main(String[] args) {
        B329Dog dog = new B329Dog();
        dog.sound();

        B329Cat cat = new B329Cat();
        cat.sound();

        animalSound(new B329Dog() );
        animalSound(cat);
    }
    public static void animalSound(B329Animal animal){
        animal.sound();
    }
}

