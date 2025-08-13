package _05_class;

public class StudentEx {
    public static void main(String[] args) {
        Student s1 = new Student("lee", 3);
        System.out.println(s1);

        s1.goToSchool();
        s1.study("Java Programming");

        System.out.println("grade: "+s1.getGrade());
        System.out.println(s1.getTestResult(100));

        System.out.println("s1의 필드 : "+s1.grade);
        System.out.println("s1의 필드 : "+s1.name);

        System.out.println("--------------------------------------------");

        Student s2 = new Student("park", 1);
        System.out.println(s2);

    }
}
