package _05_class._b_static;

public class SingletonEx {
//    Singleton s1 = new Singleton(); private생성자라 인스턴스 생성 불가능
    public static void main(String[] args) {
        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();

        if(s2 == s3){
            System.out.println("같은 객체입니다.");
            System.out.println(s2);
            System.out.println(s3);
        }else{
            System.out.println("다르묘!!");
        }
    }
}
