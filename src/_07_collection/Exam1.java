package _07_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exam1 {
    public static void main(String[] args) {

        Set<Integer> unique = new HashSet<>(); //

        Scanner sc = new Scanner(System.in);
        int input ;

        System.out.println("정수 입력, -1입력 시 종료.");
        while (true){
            System.out.println("정수 입력 : ");
            input = sc.nextInt();
            if(input == -1){
                break;
            }
            unique.add(input);
        }
        sc.close();
        System.out.println("중복 제거 목록 : "+unique);
    }
}
