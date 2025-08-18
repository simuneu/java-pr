package _05_class._e_abstract;

public class ShapeEx {
    public static void main(String[] args) {
//        Shape test = new Shape("red") //추상 클래스라서 실제 인스턴스 생성 불가
        Circle circle = new Circle("red");
        Square square = new Square("blue", "마름모");

        System.out.println("====원====");
        circle.start();
        circle.draw();
        System.out.println("원의 색은 "+circle.getColor());

        System.out.println("====사각형====");
        square.start();
        square.draw();
        square.showType(); //square의 일반 메소드
        System.out.println("사각형의 종류는 "+square.getType() +", 색깔은? "+square.getColor());
    }
}
