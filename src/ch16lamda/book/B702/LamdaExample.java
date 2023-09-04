package ch16lamda.book.B702;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1(((name, job) -> {
            System.out.println(name+"이");
            System.out.println(job+"을 합니다.");
        }));
        person.action1((name, job) -> System.out.println(name+"이"+job+"을 하지 않습니다."));

        person.action2(word->{
            System.out.println(word);
            System.out.println("라고 말합니다.");
        });

        person.action2(word-> System.out.println(word+"라고 외칩니다"));

    }

    class MySpeakable implements Speakalbe{
        @Override
        public void speak(String word) {//꼭 추상메소드의 매개변수 명과 같을 필요 없음
            System.out.println(word+"라고 외칩니다.");
        }
    }
}
