import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /* 접근제어자
    * public,private, default,protected
    * static: jvm이 main함수를 곧바로 실행하도록 도와줌
    * void: main함수의 return type
    * */
    public static void main(String[] args) {
        //args 인자 확인
        System.out.println("Hello and welcome!");
        System.out.println("args length : "+args.length);
        System.out.println(Arrays.toString(args));
        //java src/Main.java 11 22
        //11 22같은 인자는 안 줘도 됨!
    }
}
