package ch08interface.book.B353;

public interface RemoteControl {
    //기본값이 static final로 상수임(메소드가 기본값이 추상 메소드인 것처럼)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음처리합니다.");
            setVolume(MIN_VOLUME);
        } else{
            System.out.println("무음 해제합니다.");
        }
    }
}
