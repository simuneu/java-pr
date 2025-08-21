package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student stu1 = new Student(); //객체, 인스턴스
        stu1.name = "park";
        stu1.age = 20;
        stu1.grade = 100;

        Student stu2  = new Student();
        stu2.name = "lee";
        stu2.age = 39;
        stu2.grade = 99;

        System.out.println("이름: "+stu1.name+", 나이 : "+stu1.age+", 성적 : "+ stu1.grade);
        System.out.println("이름: "+stu2.name+", 나이 : "+stu2.age+", 성적 : "+ stu2.grade);

        System.out.println(stu1); //서로 다른 참조값
        System.out.println(stu2);
    }
}
