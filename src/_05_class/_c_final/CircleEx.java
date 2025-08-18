package _05_class._c_final;

import java.util.Scanner;

public class CircleEx {
    final Double radius;
    static double pi = 3.14;

    public CircleEx(Double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return pi*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요:");
        Double inputRadius = scan.nextDouble();
        CircleEx c1 = new CircleEx(inputRadius);
        System.out.println("원의 반지름 : "+inputRadius);
        System.out.println("원의 넓이 : "+c1.calculateArea());
    }
}
