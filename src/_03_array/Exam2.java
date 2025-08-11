package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> strArr = new ArrayList<>();


        System.out.println("문자를 입력해주세요. 그만할거면 exit 입력");
        while (true){
            System.out.println("입력하세요. : ");
            String input = scan.nextLine();

            if(input.equals("exit")){
               break;
            }
            strArr.add(input);
        }
        System.out.println(strArr);

//        String str1 = scan.next();
//        System.out.println("문자를 입력해주세요.");
//        String str2 = scan.next();
//        System.out.println("문자를 입력해주세요.");
//        String str3 = scan.next();
//        System.out.println("문자를 입력해주세요.");
//        String str4 = scan.next();
    }
}
