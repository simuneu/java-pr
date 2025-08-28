package oop1;

public class MusicPlayer {
    int volume; //멤버 변수
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("플레이어 시작");
    }
    void off(){
        isOn = false;
        System.out.println("플레이어 끔");
    }
    void volumeUp(){
        volume++;
        System.out.println("볼륨 : "+volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("볼륨 : "+volume);
    }
    void status(){
        if(isOn){
            System.out.println(volume);
        }else{
            System.out.println(isOn);
        }
    }
}
