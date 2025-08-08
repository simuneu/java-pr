package _01basic;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("=== primitive type ===");
        int a = 11;
        long b = 1000;
        float c = 3.14f; //f 필수
        double d = 2.72354235;

        char ch = 'G';

        boolean bool = true;

        System.out.println("정수형:"+a+","+b);
        System.out.println("실수형:"+c+","+d);
        System.out.println("문자형:"+ch);
        System.out.println("논리형:"+bool);

        /////////////////////////////////
        System.out.println("===reference type===");
//        1. primitive에도 있는 자료형
        Integer aa = 11;
        Long bb = 3000000000L;
        Short cc = 30000;
        Byte dd = 127;
        Float ee = 3.141592f;
        Double ff = 2.23905701958;
        Character chch = 'Y';
        Boolean bool2 = false;

        System.out.printf("Integer%d, Long:%d, Short:%d, " +
                "Byte:%d, Float:%.6f, Double:%.7f, Character:%c, Boolean:%b \n", aa, bb, cc, dd, ee, ff, chch, bool2);
        //reference타입에만 있는 자료형
        String greeting = "hello world";
        int[] numbers = {1,2,3,4,5};

        //인스턴스
        Person person = new Person("lee",10 );

        System.out.println("String 변수: "+greeting);
        System.out.println("배열변수:");
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]+"");
        }
        System.out.println();
        System.out.println("클래스로 만들어진 객체 출력");;
        System.out.println("Person 객체의 정보:"+person.getName()+","+person.getAge());
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}