package _03_array;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("다섯 개의 정수를 입력하세요.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int[]  intArr = {a,b,c,d,e};
        int sum = 0;
        double avg = 0;

        for(int i = 0; i <intArr.length; i++){
            sum += intArr[i];
            avg = sum/intArr.length;
        }
        System.out.println(avg);

    }
}
