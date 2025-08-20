package _05_class._e_abstract;

interface  Music{
    void play();
    void stop();
} //동작의 추상 메소드만 선언 가능

class MP3Player implements Music{
    private String title;
    
    public MP3Player(String title){
        this.title = title;
    }
    @Override
    public void play(){
        System.out.println("MP3Player에서"+title+"음악을 재생합니다.");
    }
    @Override
    public  void stop(){
        System.out.println("MP3Player에서"+title+"음악을 정지합니다.");
        
    }
}

class CDPlayer implements Music{
    private String title;

    public CDPlayer(String title){
        this.title = title;
    }
    @Override
    public void play(){
        System.out.println("CDPlayer에서"+title+"음악을 재생합니다.");
    }
    @Override
    public  void stop(){
        System.out.println("CDPlayer에서"+title+"음악을 정지합니다.");

    }
}

public class Practice {
    public static void main(String[] args) {
        MP3Player mp3 = new MP3Player("아이유의 블루밍");
        CDPlayer cd = new CDPlayer("아이유의 꽃갈피");

        System.out.println("====mp3====");
        mp3.play();
        mp3.stop();
        System.out.println("====cd====");
        cd.play();
        cd.stop();
    }
}
