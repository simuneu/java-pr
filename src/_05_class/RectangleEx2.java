package _05_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleEx2 {
    public static void main(String[] args) {
        List<Rectangle> recArr = new ArrayList<>();

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력");
            System.out.println("0을 입력하면 입력이 끝납니다.");
            int width = scan.nextInt();
            int height = scan.nextInt();

            if (width == 0 && height == 0) {
                break;
            } else {
                //            사각형 객체 만들기
                Rectangle r1 = new Rectangle();
                r1.setWidth(width);
                r1.setHeight(height);
                recArr.add(r1);
            }
        }
        for (int i = 0; i < recArr.size(); i++) {
            Rectangle r = recArr.get(i);
            System.out.println("가로 길이는 " + r.getWidth());
            System.out.println("세로 길이는 " + r.getHeight());
            System.out.println("넓이는 " + r.area());

        }
    }
}