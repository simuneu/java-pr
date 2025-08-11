package _03_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Java Collection List
* */
public class ArrayListEx {
    public static void main(String[] args) {
        //List<타입 정의-반드시 reference type> list = new ArrayList<>();
        List<Integer> numbers = new java.util.ArrayList<>();
        System.out.println(numbers);

        //isEmpty()
        System.out.println("isEmpty? "+numbers.isEmpty());

        //요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        System.out.println("isEmpty? "+numbers.isEmpty());
        System.out.println("contains : "+numbers.contains(10)); //요소가 있는지 없는지.
        System.out.println("contains : "+numbers.contains(11));

        //3.요소
//        System.out.println(numbers[0]); error
        System.out.println("0번째 인덱스"+numbers.get(0));
        System.out.println("1번째 인덱스"+numbers.get(1));

        //4.요소 수정
//        numbers.set(인덱스번호, 바꿀값)
        numbers.set(1, 77);
        System.out.println(numbers);//[10, 77, 30, 40, 50]

        //5.요소 삽입
//        numbers.add(인덱스번호, 요소)
        numbers.add(1, 7);
        System.out.println(numbers); //한 칸씩 밀림 [10, 7, 77, 30, 40, 50]
        
        //6. arrayList끼리 연결:addAll
        System.out.println(Arrays.asList(99,35,55)); //배열을 리스트로 변경
        List<Integer>  numbers2 = new ArrayList<>(Arrays.asList(100,99,88));
        System.out.println("numbers2 : "+numbers2);//[100, 99, 88]

        //7.요소 위치 찾기(요소)
        System.out.println(numbers.indexOf((50)));
        System.out.println(numbers.indexOf(202));//없는건 -1

        //8.요소 삭제 remove
        numbers.remove(2); //77 3번째 인덱스 삭제
        System.out.println(numbers);

        //9.리스트 크기 확인
        System.out.println("리스트의 크기 : "+numbers.size()); //

        //10모든 요소 출력
        for(int n:numbers){
            System.out.println(n+"");
        }

        //11.모든 요소 삭제
        numbers.clear();
        System.out.println(numbers);

        /// ///////////////////////////////////
        //Student type의 instance
        List<Student> students = new ArrayList<>();
        students.add(new Student("anna", 23));
        students.add(new Student("enna", 22));
        students.add(new Student("marie", 26));
        students.add(new Student("nicky", 23));
        students.add(new Student("alice", 28));

        System.out.println("학생 수:"+students.size());
        Student std1 = students.get(0); //첫 번째 학생 만들기.
        System.out.println(std1.getName()+"학생의 나이는 "+std1.getAge());

        System.out.println("학생 명단 :");
        for(Student std:students){
            System.out.println(std.getName()+"("+std.getAge()+")");
        }
        students.remove(2);
        System.out.println("삭제 후 : "+students);
        for(Student std:students){
            System.out.println(std.getName()+"("+std.getAge()+")");
        }//세 번째 학생 삭제
    }
}

class Student{
    private String name;
    private  int age;

    public Student(String name, int age){
        this.name= name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Student{"+
                "name='"+name+'\''+
                ", age="+age+
                '}';
    }
}

