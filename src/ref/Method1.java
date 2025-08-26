package ref;

public class Method1 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        initStudent(stu1, "lee", 30, 80);

        Student stu2 = new Student();
        initStudent(stu2, "song", 40, 90);

        printStu(stu1);
        printStu(stu2);

    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStu(Student student){
        System.out.println("이름 : "+student.name+" 나이 : "+student.age+" 성적 : "+student.grade);
    }
}
