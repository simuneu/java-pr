package _01basic;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("안녕하세요. \n");
        System.out.print("제 이름은 lee \t");
        System.out.println("요로시쿠");

        Scanner scanner = new Scanner(System.in);
        System.out.println("공백으로 구분하여 이름 /나이/키/결혼여부를 입력");

        String name = scanner.next();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        boolean single = scanner.nextBoolean();
        scanner.close();

        System.out.println("=== 입력 결과 출력 ===");
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("키 : "+height);
        System.out.println("결혼여부 : "+single);
//        lee 20 186 false (엔터, 탭으로 가능)
//         === 입력 결과 출력 ===
//        이름 : lee
//        나이 : 20
//        키 : 186.0
//        결혼여부 : false
    }
}
