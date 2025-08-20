package _07_collection._set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("kiwi");
        set1.add("orange");
        System.out.println(set1); //순서가 오름차순도 넣은 순서도 아님.

        set1.add("banana");
        System.out.println(set1); //중복 객체는 저장되지 않음

        System.out.printf("set1에는 총 %d 종류의 과일이 있어요. %n", set1.size());

        //
        Set<Course> set2 = new HashSet<>();
        Course java = new Course(101, "Java"); //2301607
        Course js1 = new Course(102, "JavaScript"); //1266328083
        Course js2 = new Course(102, "JavaScript"); //1266328083

        System.out.println(java.hashCode());
        System.out.println(js1.hashCode());
        System.out.println(js2.hashCode());
        System.out.println(js1.equals(js2)); //원래 false지만 id, title이 같다면 같은 객체라고 아래에 재정의했음.
//        System.out.println("apple".hashCode());//93029210

        set2.add(java);
        set2.add(js1);
        set2.add(js2);

        System.out.println("===반복문으로 set2객체 출력===");
        System.out.println("set2의 크기 : "+set2.size());
        for(Course c :set2){
            System.out.println(c);
        }

        //set순회하기 2.iterator사용
        System.out.println("===iterator로 set2객체 출력===");
        Iterator<Course> iterator = set2.iterator();
        /*
        * Iterator<E> iterator() : 요소를 순환하기 위한 iterator<E>객체를 반환
        * boolean hasNext() : 순회하지 않은 요소가 있으면 true, 없으면 false
        * E next() : 객체에서 다음 요소로 이동하고, 해당 요소를 반환
        * void remove() : next()로 가져온 객체를 컬렉션에서 삭제
        * */
        while (iterator.hasNext()){
            Course c = iterator.next();
            System.out.println(c);
        }
    }
}

class Course{
    private int id;
    private String title;

    public Course(int id, String title){
        this.id = id;
        this.title = title;
    }
    @Override
    public int hashCode(){
        return title.hashCode()+id;
        //똑같은 title, id를 가질 때 동일한 hashcode를 반환하도록
    }

    @Override
    public boolean equals(Object obj){
//        if(obj instanceof Course){
//            Course target = (Course)obj;
//        }
        if(obj instanceof Course target){
            return target.id ==id && target.title.equals(title);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format("""
                Course{
                    id=%d,
                    title=%s}
                """, id, title);
    }
}