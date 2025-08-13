package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        int arrLen=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하세요.");

        try{
            arrLen = scan.nextInt();
        }catch (InputMismatchException | ArithmeticException e ){
            System.out.println("배열의 크기는 양수나 정수여야 합니다."+e.toString());
        }

        int[] numArr = new int[arrLen];
        double avg = 0;
        int sum = 0;

        for (int i=0 ; i<numArr.length; i++){
            System.out.println("배열에 넣을 숫자를 입력하세요.");
            try{
                numArr[i] = scan.nextInt();
                sum += numArr[i];
            }catch (InputMismatchException e){
                System.out.println("정수를 입력하세요."+e.toString());
            }

        }
        avg= sum/numArr.length;
        System.out.println("평균: "+avg);
    }
}
