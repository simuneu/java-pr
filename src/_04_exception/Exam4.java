package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("배열의 크기를 입력하세요.");
            int size = scan.nextInt();
            if(size <=0){
                throw new IllegalArgumentException("잘못된 값이 잔달되었습니다."); //0혹은 음수
            }
            int[] arr = new int[size];
            for(int i = 0; i<size; i++){
                System.out.println("정수입력 :" );
                arr[i] = scan.nextInt();
            }
            ArrayList<Integer> duplicates = findDu(arr);
            if(duplicates.isEmpty()){
                System.out.println("중복된 요소가 없습니다.");
            }else{
                System.out.println("중복된 요소 :"+ duplicates );
            }
        }catch (InputMismatchException e){
            System.out.println("배열의 크기로는 정수를 입력하세요.");
        }catch (IllegalArgumentException e){
            System.out.println("배열의 크기는 1이상의 자연수이어야 합니다.");
        }
    }
    public static ArrayList<Integer> findDu(int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();
        //중복될 요소가 몇 개일지 확실하지 않음=>정적 할당 불가
        //배열의 크기를 조절할 수 있는 arrayList사용=>동적 할당 가능
        //[1,2,3,4,5]
        //1 vs 2,3,4,5
        //2 vs 3,4,5
        //3 vs 4,5
        //4 vd 5
        //비교할 때마다 같으면 duplicates에 add
        for(int i= 0; i<arr.length-1; i++){ //4까지만 비교
            for(int j=i+1; j<arr.length; j++){ //앞 쪽에 선택된 수 vs 그 다음부터 끝까지
                if(arr[i]==arr[j] && !duplicates.contains(arr[i])){ //arr배열에 중복된 요소가 있고, duplicates에 해당요소가 없는 경우
                    duplicates.add(arr[j]);
                }
            }
        }
        return duplicates;
    }
}
