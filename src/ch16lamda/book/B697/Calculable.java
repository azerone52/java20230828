package ch16lamda.book.B697;

//Functional Interface
//추상메소드가 하나인 인터페이스
@FunctionalInterface //이 인터페이스가 추상메소드가 하나인지 컴파일러를 통해 검증
public interface Calculable {
    void calculatate(int x, int y);

}
