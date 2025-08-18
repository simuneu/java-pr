package _05_class.exam2;

import java.util.ArrayList;
import java.util.List;

public class ShapeEx {
    public static void main(String[] args) {
        List<Shape> shapes= new ArrayList<>();

        shapes.add(new Circle("red", "circle", 5.0));
        shapes.add(new Rectangle("blue", "rectangle", 5.0, 5.0));

        Shape circle = shapes.get(0);
        System.out.println("====== " + circle.getType() + " 도형의 정보 ======");
        System.out.println("도형의 색상: " + circle.getColor());
        System.out.println("도형의 넓이: " + circle.calculateArea());

        Shape rectangle = shapes.get(1);
        System.out.println("====== " + rectangle.getType() + " 도형의 정보 ======");
        System.out.println("도형의 색상: " + rectangle.getColor());
        System.out.println("도형의 넓이: " + rectangle.calculateArea());
    }
}
