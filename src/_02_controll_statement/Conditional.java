package _02_controll_statement;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int number = 10;
        if(number%2==0){
            System.out.println(number+"는 짝수");
        }else{
            System.out.println(number+"는 홀수");
        }

        if(number%3==0){
            System.out.println("3의 배수");
        }else if(number%5==0){
            System.out.println("5의 배수");
        }else{
            System.out.println("3의 배수도, 5의 배수도 아님.");
        }

        String dayOfWeek;
        int day = 0;
        switch (day){
            case 0 :
                dayOfWeek = "일요일";
                break;
            case 1 :
                dayOfWeek = "월요일";
                break;
            case 2 :
                dayOfWeek = "화요일";
                break;
            case 3 :
            case 4 :
            case 5 :
            case 6 :
                dayOfWeek = "수~토요일";
                break;
            default:
                dayOfWeek="잘못된 입력입니다.";
        }
        System.out.println("오늘은 "+dayOfWeek);

        //switch표현식
        //0,6주말
        //나머지 평일
        String yoil = switch(day){
            case 1,2,3,4,5 -> "평일";
            case 0,6 ->"주말";
            default -> {
                //여러 줄 실행하고 싶을 땐 중괄호 블록으로 묶어서 사용
                System.out.println("잘못된 입력값입니다.");
                yield "알 수 없음";
                //yield필수
                //스위치 표현식의 리턴이라고 생각하기.
            }
        };
        System.out.println("오늘은"+yoil+"입니다.");

        System.out.println("===============문자열 비교=================");
        System.out.println("이름을 입력해 주세요.");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        scan.close();
        System.out.println("이름 확인 : "+name);

//        if(name=="lee"){ //false
//            System.out.println("lee welcome");
//        }else{
//            System.out.println("who are you?");
//        }

        if(name.equals("lee")){
            System.out.println("lee welcome");
        }else{
            System.out.println("who are you?");
        }

        String str1 = "hello world";
        String str2 = "hello world"; //문자열 리터럴

        /*
        * 동일한 문자열 리터럴 => 자바에서 같은 메모리 영역의 문자열을 저장.(String pool)
        * */
        if(str1==str2){
            System.out.println("서로 같은 참조를 가리킵니다.");
        }else{
            System.out.println("서로 다른 참조를 가리킵니다.");
        }

        if(str1.equals(str2)){
            System.out.println("내용이 같아요.");
        }else{
            System.out.println("내용이 달라요.");
        }

        String str3 = new String("hello world");//문자열 객체
        String str4 = new String("hello world");//문자열 객체

        if(str3 == str4){
            System.out.println("서로 같은 참조를 가리킵니다.");
        }else{
            System.out.println("서로 다른 참조를 가리킵니다."); //다른 참조가 출력.
        }

        if(str3.equals(str4)){
            System.out.println("내용이 같아요.");
        }else{
            System.out.println("내용이 달라요.");
        }
    }
}
