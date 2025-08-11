package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static String divide(int x, int y){
        return x+"/"+y+"="+(x/y);
    }

    public static int getLength(String str){
        return str.length();
    }
    
    public static int getValueByIndex(int[] arr, int idx){
        //배열의 요소를 반환하는 함수
        return arr[idx]; 
    }

    public static void main(String[] args) {
        System.out.println(divide(6,2));
//        System.out.println(divide(6,0));
        //-------ArithmeticException (0으로 나눔)
        try{
            System.out.println("나누기 연산 시작 !");
            System.out.println(divide(6,2));
//            System.out.println(divide(6,0));
        }catch (ArithmeticException e){
            System.out.println("나누기 중 에러 발생"+e.getMessage()); //이유
            System.out.println("나누기 중 에러 발생"+e.toString()); //이유랑 종류
        }finally {
            System.out.println("나누기 연산 종료!");
        }

        System.out.println("---------------------");
        //-------NullPointerException null에 접근하려고 할 때

        try{
            System.out.println("단어길이:"+getLength(new String("hello")));
            System.out.println("단어길이:"+getLength(null));
        }catch (NullPointerException e ){
            System.out.println("null에 접근 ! "+e.toString());
        }
            System.out.println("문자열 길이 조회 끝");

        //--------ArrayIndexOutOfBoundsException
        int[] numbers = {10,20,30,40,50};
        try{
            System.out.println(getValueByIndex(numbers,1)); //20
            System.out.println(getValueByIndex(numbers,10)); //excoption.
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("에러발생, 없는 인덱스 조회"+e.toString());
        }

        //--------InputMismatchException입력형식 오류
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력");

        try{
            int num = sc.nextInt();
            System.out.println("정수확인"+num);
        }catch (InputMismatchException e){
            System.out.println("정수를 입력해야 함~ : "+e.toString());
        }
    }
    /*
    * 다양한 예외 처리 상황
    * 1. catch 여러 개 사용 가능
    * try{~~~
    * }catch(Exception1 e ){
    * }catch(Exception2 e){
    * }catch(Exception3 e){
    * }....
    * 여러 개의 예외를 받아주는 경우, 각 예외마다 처리 방법이 다를 때.
    *
    * 2. 하나의 catch에 exception을 여러 개 작성 가능.
    * try{
    * }catch(Exception1 | Exception2 | Exception1 e){
    * }
    * 여러 개의 에러를 받지만 catch처리 구문이 비슷할 (예외 처리가 비슷할 경우)
    *
    * 3. exception이라는 전체 예외 타입 명시 가능
    * try{
    * }catch(Exception e){
    * }
    * 웬만하면 디테일한 에러 종류의 타입을 명시
    * */
}