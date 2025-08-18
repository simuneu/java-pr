package _05_class.exam2;

public class MusicMain {
    public static void main(String[] args) {
        Music ms;

        System.out.println("====MP3====");
        ms = new MP3Player();
        ms.play();
        ms.stop();
        System.out.println("====CD====");
        ms = new CDPlayer();
        ms.play();
        ms.stop();
    }
}
