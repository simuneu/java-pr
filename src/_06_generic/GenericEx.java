package _06_generic;

import _05_class._a_access_modifier.pack2.C;

import java.util.ArrayList;

class CustomList{
    ArrayList<String> list = new ArrayList<>();

    //메소드: 요소 추가, 요소 삭제, 요소 접근
    public void addElement(String element){
        list.add(element);
    }

    public void removeElement(String element){
        list.remove(element);
    }

    public String get(int index){
        return list.get(index);
    }

    @Override
    public String toString(){
        return "CustomList:"+list;
    }
}

class CustomListGeneric<T>{
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }

    public T get(int i){
        return list.get(i);
    }

    @Override
    public String toString(){
        return "CustomListGeneric:"+list;
    }
}


public class GenericEx {
    public static void main(String[] args) {
        CustomList li = new CustomList();
        li.addElement("first");
        li.addElement("second");
        li.addElement("third");
        System.out.println(li.toString());

        li.removeElement("second");
        System.out.println(li.toString());

        System.out.println(li.get(0));

        //클래스이름<사용할 타입> 변수명 = new 생성자이름<>()
        //레퍼런스 타입이 들어가야 함
        CustomListGeneric<Integer> gLi = new CustomListGeneric<>();
        gLi.addElement(10);
        gLi.addElement(20);
        gLi.addElement(30);
        System.out.println(gLi.toString());

        gLi.removeElement(10);
        System.out.println(gLi.toString());

        System.out.println(gLi.get(0));
        
        CustomListGeneric<Character> gLi2 = new CustomListGeneric<>();
        gLi2.addElement('A');
        gLi2.addElement('1');
        gLi2.addElement('가');
        gLi2.addElement('@');
        System.out.println(gLi2.toString());

        gLi2.removeElement('@');
        System.out.println(gLi2.toString());

        System.out.println(gLi2.get(2));;

    }
}
