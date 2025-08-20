package _07_collection._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //객체 저장 put(k, v)
        map.put(1001,"홍");
        map.put(1002,"김");
        map.put(1003,"이");
        map.put(1004,"박");
        map.put(1004,"박박");
        System.out.println(map);
        //요소 개수
        System.out.println("map의 데이터 개수 : "+map.size());
        //key접근
        int key = 1003;
        String value = map.get(key);
        System.out.printf("%d번 학생의 이름은 %s", key, value);
        System.out.println();
        //순회
        System.out.println("===map 순회(1) entrySet(), for문 이용===");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet); //[1001=홍, 1002=김, 1003=이, 1004=박박]
        for(Map.Entry<Integer, String>entry:entrySet){
            System.out.println(entry.getKey()+"번 학생 : "+entry.getValue());
        }

        System.out.println("===map 순회(2) entrySet(), Iterator 객체 이용===");
        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer, String> studentEntry = entryIterator.next();
            //studentEntry: 1001=홍
            Integer entryKey = studentEntry.getKey(); //1001
            String entryValue = studentEntry.getValue(); //홍
            System.out.printf("%d번 학생 : %s %n", entryKey, entryValue);
        }
        System.out.println("===map 순회(3) keySet(), for문 이용===");
        Set<Integer> keySet =  map.keySet(); //[1001, 1002, 1003, 1004]
        System.out.println("ketSet : "+keySet);
        for(Integer k : keySet){
            System.out.printf("Key : %d, Value : %s %n", k,map.get(k));
        }
        //map 요소 삭제
        String deletedValue =  map.remove(1003);
        System.out.println("삭제되는 value : "+deletedValue);
        System.out.println("삭제 후 map : "+map);
    }
}
