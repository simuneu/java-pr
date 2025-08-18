package _05_class.exam2;

public class CDPlayer implements Music{
    @Override
    public void play(){
        System.out.println("CD Player에서 "+ singer+"의"+ song1+" 음악을 재생합니다.");
    }

    public void stop(){
        System.out.println("CD Player에서 "+ singer+"의"+ song1+" 음악을 정지합니다.");
    }

}
