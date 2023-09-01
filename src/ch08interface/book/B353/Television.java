package ch08interface.book.B353;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>MAX_VOLUME){
            //이미 인터페이스를 구현 받았으므로 굳이 인터페이스명 안적어도 되긴함.
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume<MIN_VOLUME){
            this.volume = MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 티비 볼륨: "+this.volume);
    }
}
