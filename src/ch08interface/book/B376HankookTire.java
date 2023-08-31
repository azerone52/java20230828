package ch08interface.book;

public class B376HankookTire implements B376Tire{
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
