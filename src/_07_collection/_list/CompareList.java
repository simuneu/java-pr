package _07_collection._list;

import java.util.ArrayList;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();

        for(int i = 0 ; i<10000; i++){
            list1.add(0,String.valueOf(i)); //i를 string으로 변환
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList 소요 시간 "+(endTime-startTime));
        /// //////////////////////////////////////////////////////////

        startTime = System.nanoTime();

        for(int i = 0 ; i<10000; i++){
            list2.add(0,String.valueOf(i)); //i를 string으로 변환
        }

        endTime = System.nanoTime();
        System.out.println("LinkedList 소요 시간 "+(endTime-startTime));
    }
}
