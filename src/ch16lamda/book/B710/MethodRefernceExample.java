package ch16lamda.book.B710;

public class MethodRefernceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase);
    }
}
