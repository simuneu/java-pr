package _05_class._f_interface;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("리모컨으로 텔레비전을 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("리모컨으로 텔레비전을 끕니다.");
    }

    @Override
    public void setVolume(int v){
        if(v >RemoteControl.MAX_VOLUME){
            volume = RemoteControl.MAX_VOLUME;
        }else if(v<RemoteControl.MIN_VOLUME){
            volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = v;
        }
        System.out.println("TV의 현재 볼륨값:"+volume);
    }
}
