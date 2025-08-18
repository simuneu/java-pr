package _05_class._f_interface;

public interface RemoteControl {
    //추상메소드가 한 개 이상 무조건 있어야 함.

    public void turnOn(); //abstract생략해도 어차피 추상
    public void turnOff();
    public void setVolume(int volume);

    int MAX_VOLUME = 10; //public static final 샐략가능, 상수라서 대문자.
    int MIN_VOLUME = 0;



}
