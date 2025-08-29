package _07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Map<String, Integer> person = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("이름과 나이를 입력 종료를 입력하면 종료");

        while (true){
            System.out.printf("이름 입력 : ");
            name= sc.next();
            if(name.equals("종료")){
                break;
            }

            System.out.printf("나이 입력 : ");
            age = sc.nextInt();
            person.put(name, age);
            System.out.println("");
        }
        sc.close();
        System.out.println("===입력받은 나이와 이름 목록===");
        for(Map.Entry<String, Integer> entry:person.entrySet()){
            System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());
        }
    }
}
