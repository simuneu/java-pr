package _05_class._b_static;


public class CalculatorsEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        double circleArea = num1*num2 *Calculator.pi;
        int plusResult = Calculator.plus(num1,+num2);
        int minusResult = Calculator.minus(num1,num2);

        System.out.println("원의 넓이 : "+circleArea);
        System.out.println("덧셈 결과 : "+plusResult);
        System.out.println("뺄셈 결과 : "+minusResult);

        System.out.println(a);
        a = 16;
        System.out.println("static변수는 변경이 가능합니다.");
    }
    static int a = 10;

}
