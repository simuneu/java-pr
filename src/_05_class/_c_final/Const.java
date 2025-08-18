package _05_class._c_final;

public class Const {
    final String name;
    public Const (String name){
        this.name = name;
    }

    static int MIN_VALUE = 0; //인스턴스 공유 변수, 수정 불가

    //정수형 상수 선언
    public static  final int MAX_VALUE=100;

    public static final String GREETING = "hello world";

    public static void main(String[] args) {
        System.out.println(MAX_VALUE); //final
        System.out.println(MIN_VALUE);

        Const.MIN_VALUE=10;
        System.out.println("변경 후 min_value: "+Const.MIN_VALUE);
//        Const.MAX_VALUE=90;

        Const c1 = new Const("lee");
        System.out.println(c1.name);
//        c1.name="lee"; //error

    }
}
