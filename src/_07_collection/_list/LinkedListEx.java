package _07_collection._list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("초기 linked list : "+list);

        //addFirst(), addLast() : LinkedList에 특화된 메소드
        list.addFirst("grape");
        list.addFirst("orange");
        System.out.println("요소 추가 후 : "+list);
        
        list.add(2, "grapefruits");
        list.add(2, "kiwi");
        System.out.println("중간 요소 추가 후 : "+list);

        list.remove("banana");
        System.out.println("banana 삭제 후 : "+list);
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println("삭제된 요소 : " + first);
        System.out.println("삭제된 요소 : " + last);
        System.out.println("삭제 후 list : "+list);

        //요소 검색
        boolean containsCherry = list.contains("cherry"); //false
        int indexOfCherry = list.indexOf("cherry"); //-1예상
        System.out.println("cherry 포함 여부"+ containsCherry);
        System.out.println("cherry index 여부"+ indexOfCherry);

        for(String f :list){
            System.out.println("fruit : "+f);
        }

        System.out.println("Linked list의 크기 : "+list.size());
        list.clear();
        System.out.println("삭제 후Linked list의 크기 : "+list.size());
        
    }
}
