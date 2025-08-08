package _02_controll_statement;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1.
        System.out.println("나이를 입력하세요.");
        int age = scan.nextInt();

        if (age < 0) {
            System.out.println("양수로 입력하세요.");
        } else {
            String result = switch (age) {
                case 1, 2, 3, 4, 5, 6, 7 -> "유아";
                case 8, 9, 10, 11, 12, 13 -> "초등학생";
                case 17, 18, 19 -> "고등학생";
                default -> {
                    System.out.println("성인");
                    yield "알 수 없음";
                }
            };
            System.out.println("결과: " + result);
        }

        //2.
        System.out.println("이름을 입력하세요.");
        String name = scan.next();
        if(name.equals("홍길동")){
            System.out.println("남자");
        }else if(name.equals("성춘향")){
            System.out.println("여자");
        }else{
            System.out.println("모르겠어요.");
        }

        //3.
        System.out.println("세 개의 정수를 입력해 주세요.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int[] arr = {num1,num2, num3 };
        int max = arr[0];
        int min = arr[0];

        int avg = (num1+num2+num3)/3;
        for(int i =1; i <arr.length ;i++){
           if(arr[i]>max){
               max = arr[i];
           }
           if(arr[i]<min){
               min = arr[i];
           }
        }
        System.out.println("평균: " + avg);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        //4.
        System.out.println("숫자를 입력하세요");
        int num = scan.nextInt();
        for(int i =0; i<num;i++){
            System.out.println(i+1);
        }
    }


}
