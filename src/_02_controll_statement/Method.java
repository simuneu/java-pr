package _02_controll_statement;

import java.util.Arrays;

//method정의 방법
//(접근제한자)(static)(return type)(함수 이름)(인자1 ...){함수 내용 작성 return (void면 생략}
public class Method {
    public static void main(String[] args) {
        hello();
        System.out.println(sum1(1,2));
        System.out.println(connect("피요", "몬"));

        int num = 10;
        int[] nums = {10, 20};

        //call by value - primitive type 값을 전달하는 것이라 원래 값이 변경되지 않음
        System.out.println("함수 들어가기 전"+num);
        System.out.println("함수 리턴"+multi10(num));
        System.out.println("함수 들어간 후"+num); //함수 안에서 쓰이고 끝. 값이 바뀌지 않음
        System.out.println("  ");

        //call by address - reference type전달. 참조값(주소)을 써서 원래 값이 변경됨
//        System.out.println("함수 들어가기 전"+nums);
        System.out.println("함수 들어가기 전"+Arrays.toString(nums));
//        System.out.println("함수 리턴"+multi10_2(nums));
        System.out.println("함수 들어가기 전"+Arrays.toString(nums));
//        System.out.println("함수 들어간 후"+nums);
        System.out.println("함수 들어간 후"+Arrays.toString(nums));

    }
    //반환값 없는 메소드
    public static void hello(){
        System.out.println("hello");
    }

    public static int sum1(int x, int y){
        System.out.println("sum1 호출");
        return x+y;
    }

    public static String connect(String a, String b){
        System.out.println("connect호출");
        return a+b;
    }

    public static int multi10(int x){
        x = x*10;
        return x;
    }

    public static int[] multi10_2(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers[i]*10;
        }
        return numbers;
    }


}
