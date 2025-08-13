package _05_class._b_static;
/*
* static멤버
* 객체를 비교했을 때, 클래스를 통해서 바로 접근 가능
* new ClassName()을 통해 객체생성하지 않아도 됨
* 클래스 이름, 필드 이름, 메소드 이름 dot(.)연산자로 접근 가능
* */
public class Calculator {
    static double pi = 3.141592;

    static int plus(int x, int y){
        return x+y;
    }
    static int minus(int x, int y){
        return x-y;
    }
}
