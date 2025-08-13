package _05_class._a_access_modifier.pack5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("사각형의 가로, 세로 길이를 입력해주세요.");
            int width = scan.nextInt();
            int height = scan.nextInt();

            if(width==0 && height==0){
                break;
            }
            Rectangle rec = new Rectangle(width);
            rec.setHeight(height);

            rectangleList.add(rec);
        }
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력");
        for(Rectangle element: rectangleList){
            System.out.println("가로 길이는 : "+element.getWidth());
            System.out.println("세로 길이는 : "+element.getHeight());
            System.out.println("넓이는 : "+element.area());

        }
    }
}
