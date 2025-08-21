package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student stu1 = new Student(); //객체, 인스턴스(어떤 클래스에 속해있는지를 표현할 때) - 보통 구분하지 않음
        stu1.name = "park";
        stu1.age = 20;
        stu1.grade = 100;

        Student stu2  = new Student();
        stu2.name = "lee";
        stu2.age = 39;
        stu2.grade = 99;

//        Student[] students = new Student[]{stu1, stu2};
        Student[] students = {stu1, stu2}; //최적화

        for(int i = 0; i<students.length; i++){
            Student s = students[i]; //변수로 간단하게
            System.out.println("이름: "+s.name+", 나이 : "+s.age+", 성적 : "+ s.grade);
        }

        for(Student s :students){ //향상된 for문
            System.out.println("이름: "+s.name+", 나이 : "+s.age+", 성적 : "+ s.grade);
        } //iter단축키
      
        System.out.println(stu1); //서로 다른 참조값
        System.out.println(stu2);
    }
}
