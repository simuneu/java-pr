package _05_class._e_abstract;
/*
* 도형이라는 추상적 개념을 바탕으로 원, 삼각형등을 만들 수 있음
* 추상 클래스 내부 멤버는 원,, 삼각형등에 공통으로 사용될 필드와 메소드를 미리 선언
* */
public abstract class Shape {
    String color;
    public Shape(String color){
        this.color = color;
    }

    //추상 메소드
    abstract void draw();

    void start(){
        System.out.println("도형 그리기 시작");
    }

    String getColor(){
        return this.color;
    }
}
