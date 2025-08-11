package _02_controll_statement;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Exam3 e3 = new Exam3();
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("덧셈 결과"+ e3.add(a,b));
        System.out.println("뺄셈 결과"+ e3.minus(a,b));
        System.out.println("나눗셈 결과"+ e3.divide(a,b));
        System.out.println("곱셈 결과"+ e3.multi(a,b));
    }

    public double add(double a, double b){
        return a+b;
    }
    public double minus(double a, double b){
        return a-b;
    }
    public double divide(double a, double b){
        return a/b;
    }
    public double multi (double a, double b){
        return a*b;
    }

}
