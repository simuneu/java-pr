package _05_class.exam2;

public class MP3Player implements Music {
    @Override
    public void play(){
        System.out.println("MP3 Player에서 "+ singer+"의"+ song2+" 음악을 재생합니다.");
    }

    public void stop(){
        System.out.println("MP3 Player에서 "+ singer+"의"+ song2+" 음악을 정지합니다.");
    }
}
