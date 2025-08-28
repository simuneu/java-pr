package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //켜기
        data.isOn = true;
        System.out.println("플레이어 시작");

        //볼륨 증가
        data.volume++;
        System.out.println(data.volume);

        //볼륨 증가
        data.volume++;
        System.out.println(data.volume);

        //볼륨 감소
        data.volume--;
        System.out.println(data.volume);

        //풀레이어 상태
        if(data.isOn){
            System.out.println(data.volume);
        }else{
            System.out.println(data.isOn);
        }

        //끄기
        data.isOn=false;
        System.out.println(data.isOn);


    }

}
