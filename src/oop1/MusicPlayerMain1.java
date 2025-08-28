package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //켜기
        isOn = true;
        System.out.println("플레이어 시작");

        //볼륨 증가
        volume++;
        System.out.println(volume);

        //볼륨 증가
        volume++;
        System.out.println(volume);

        //볼륨 감소
        volume--;
        System.out.println(volume);

        //풀레이어 상태
        if(isOn){
            System.out.println(volume);
        }else{
            System.out.println(isOn);
        }

        //끄기
        isOn=false;
        System.out.println(isOn);


    }

}
