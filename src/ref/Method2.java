package ref;

public class Method2 {
    public static void main(String[] args) {
        Student stu1 = createStudent( "lee", 30, 80);
        Student stu2 = createStudent( "song", 40, 90);

        printStu(stu1);
        printStu(stu2);

    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStu(Student student){
        System.out.println("이름 : "+student.name+" 나이 : "+student.age+" 성적 : "+student.grade);
    }
}
