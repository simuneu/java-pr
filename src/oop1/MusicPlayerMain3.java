package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //켜기
        on(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 증가
        volumeUp(data);


        //볼륨 감소
        volumeDown(data);


        //풀레이어 상태
        status(data);

        //끄기
        off(data);



    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("플레이어 시작");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("플레이어 끔");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("볼륨 : "+data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("볼륨 : "+data.volume);
    }
    static void status(MusicPlayerData data){
        if(data.isOn){
            System.out.println(data.volume);
        }else{
            System.out.println(data.isOn);
        }
    }

}
