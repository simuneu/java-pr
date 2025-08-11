package _03_array;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//표준 배열
public class Array {
    public static void main(String[] args) {
        int[] arr1; //더 많이 씀
        int arr2[];

        String[] temp = null;
        System.out.println(temp);

        int[] intArray = {10, 22, 25, 45, 55};
        System.out.println("intArray[0]:"+intArray[0]);
        System.out.println("intArray:"+intArray);
        intArray[1]=20;
        System.out.println("intArray:"+ Arrays.toString(intArray));

        char[] charArray={'a', 'A', '2', 66};
        System.out.println(charArray[2]); //2
        System.out.println(charArray[3]); //B - 아스키코드 대치

        double[] doubleArray = new double[3]; //배열 길이 할당
        System.out.println(doubleArray[0]); //0.0(double의 기본값)

        doubleArray[0]= 0.1;
        doubleArray[1]= 0.12;
        doubleArray[2]= 0.13;
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(doubleArray.length);

        //다차원 배열
        int[][] matrix = {{1,2,3}, {4,5,6}};//선언, 초기화 동시 2X3
        System.out.println(matrix[0][1]); //2
        System.out.println(matrix[1][2]);//6

        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;
        //{{1,2},{3,4},{5,6}}

        //객체 참조 배열
        //primitive - 각 항목에 값만 저장
        //reference = 주소를 저장
        String[] strArr = new String[3];
        strArr[0]="JAVA";
        strArr[1]="JAVA";
        strArr[2]=new String ("JAVA");
        System.out.println(strArr[0] == strArr[1]); //true - 주소비교, 문자열 리터럴
        System.out.println(strArr[1] == strArr[2]); //false - 주고비교, 문자열과 리터럴 객체
        System.out.println(strArr[0].equals(strArr[2])); //true

        //배열복사
        //for
        int[] originArr = {1,2,3};
        int[] newArr = new int[5];
        System.out.println(Arrays.toString(newArr));
        for(int i = 0; i<originArr.length; i++){
            newArr[i] = originArr[i];
        }
        System.out.println("복사 결과"+Arrays.toString(newArr));
        //arrayCopy(objct src, int srcPos, Object dest, int destPos, int length)
        /*
        * objct src:원본 배열
        * int srcPos:원본배열 복사 시작 인덱스
        * Object dest 새로운 배열
        * int destPos 새 배열 붙여넣기 시작 인덱스
        * int length 복사 항목 수
        * */
        String[]  originFru = {"apple", "banana", "kiwi"};
        String[]  newFru = new String[5];
        System.out.println(Arrays.toString(newFru));
        System.arraycopy(originFru, 1, newFru, 0, originFru.length-1); //어디부터 복사, 어디부터 붙여넣기

        System.out.println(Arrays.toString(originFru));
        System.out.println(Arrays.toString(newFru));

        //java.util.Arrays method
        /*1. Arrays.copyOf() - 처음부터 복사하되 인자로 전당되는 길이만큼 복사.*/
        int[] oriArr = {1,2,3,4,5};
        int[] copyArr = Arrays.copyOf(oriArr, 3); //[1,2,3]
        int[] copyArr2 = Arrays.copyOf(oriArr, 7); //[1,2,3,4,5,0,0] //기본값으로 복사됨.
        System.out.println("copyArr:"+Arrays.toString(copyArr));
        System.out.println("copyArr2:"+Arrays.toString(copyArr2));

        /*copyOfRange(arr, sIdx, sIdx)*/
        int[] rangeArray = Arrays.copyOfRange(oriArr, 1, 4); //1포함, 4 미포함(sIdx포함, sIdx미포함)
        System.out.println("Range Array:"+Arrays.toString(rangeArray));

        /*fill(arr, val): arr의 모든 요소를 val로 채움*/
        int[] filledArray = new int[5];
        System.out.println("Filled Array before : "+Arrays.toString(filledArray));
        Arrays.fill(filledArray, 7);
        System.out.println("Filled Array after : "+Arrays.toString(filledArray));

        /*sort(arr) :배열을 무조건 오름차순으로 정렬*/
        int[] unSortedArray= {5,3,2,1,4};
        Arrays.sort(unSortedArray);//실제 원본 배열이 바뀜
        System.out.println("정렬 후:"+unSortedArray);

        //내림차순 - Integer오 선언.
        Integer[] intArr1 = new Integer[]{5,6,7,8,4};
        Arrays.sort(intArr1, Collections.reverseOrder());
        System.out.println("내림차순 정렬 후:"+intArr1);

        Integer[] intArr2 = new Integer[]{5,6,7,8,4};
        Arrays.sort(intArr2,(a, b)->b-a);
        System.out.println("내림차순 정렬 후:"+intArr2);

        /*Array.equals(arr1, arr2)*/
        //배열의 주소가 아닌 순서에 따른 값이 일치하는지 검사.
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 2, 3};
        System.out.println("Arrays 연산자(==) 비교:"+(array1 == array2)); //false
        System.out.println("Arrays 연산자(==) 비교:"+(array1 == array3)); //false

        boolean arrayEqual = Arrays.equals(array1, array2);
        boolean arrayEqual2 = Arrays.equals(array2, array3);
        System.out.println("equals비교 (1,2): "+arrayEqual); //true
        System.out.println("equals비교 (1, 3): "+arrayEqual2); //false

        /* Arrays.deepEquals(arr1, arr2)*/
        int[][] deepArray1 = {{1,2}, {3,4}};
        int[][] deepArray2 = {{1,2}, {3,4}};
        int[][] deepArray3 = {{1,2}, {3,5}};

        System.out.println("2차원 배열비교(equals)"+Arrays.equals(deepArray1, deepArray2)); //false
        System.out.println("2차원 배열비교(deepEquals)"+Arrays.deepEquals(deepArray1, deepArray2)); //true
        System.out.println("2차원 배열비교(deepEquals) - 값이 다름 "+Arrays.deepEquals(deepArray1, deepArray3)); //true

        /*Arrays.binarySearch(arr, val)*/
        //정렬 배열 기준으로 요소가 몇 번째인지 검색해주는 메소드
        int[] sortedArray = {10, 30, 40, 50, 60, 84, 104};
        int index = Arrays.binarySearch(sortedArray, 50);//3
        int index2 = Arrays.binarySearch(sortedArray, 84);//5
        int index3 = Arrays.binarySearch(sortedArray, 77);//없음

        System.out.println("index 50 :"+ index);
        System.out.println("index 84 :"+ index2);
        System.out.println("index 77 :"+ index3); //없으면 무작위의 음수 반환
    }
}