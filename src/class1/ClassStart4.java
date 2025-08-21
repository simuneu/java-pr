package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student stu1 = new Student(); //객체, 인스턴스(어떤 클래스에 속해있는지를 표현할 때) - 보통 구분하지 않음
        stu1.name = "park";
        stu1.age = 20;
        stu1.grade = 100;

        Student stu2  = new Student();
        stu2.name = "lee";
        stu2.age = 39;
        stu2.grade = 99;

        Student[] students = new Student[2]; //Student형의 배열 선언
        students[0] = stu1;
        students[1] = stu2;

        for(int i = 0; i<students.length; i++){
            System.out.println("이름: "+students[i].name+", 나이 : "+students[i].age+", 성적 : "+ students[i].grade);
        }

        System.out.println(stu1); //서로 다른 참조값
        System.out.println(stu2);
    }
}
