package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrLen = 0;

        try {
            System.out.println("배열의 크기를 입력하세요.");
            arrLen = scan.nextInt();
            System.out.println(arrLen + "개의 정수를 입력하세요.");
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요. " + e.toString());
        }

        List<Integer> numArr = new ArrayList<>();

        for(int i=0; i<arrLen; i++){
            int num = scan.nextInt();
            try {
                numArr.add(num);
            }catch (InputMismatchException e ){
                System.out.println("숫자를 입력하세요,"+e.toString());
            }
        }

        //중복찾기
        List<Integer> duplicateNum  = new ArrayList<>();
        for(int i=0 ; i<numArr.toArray().length; i++){
            int currenNum = numArr.get(i);
            boolean isDu = false;
            for(int j =0; j<i; j++){
                if(numArr.get(j).equals(currenNum)){
                    isDu= true;
                    break;
                }
            }
            if(isDu && !duplicateNum.contains(currenNum)){
                duplicateNum.add(currenNum);
            }
        }
        if(duplicateNum.isEmpty()){
            System.out.println("중복값 없음");
        }else{
            System.out.println("중복값:"+duplicateNum);
        }
    }
}
