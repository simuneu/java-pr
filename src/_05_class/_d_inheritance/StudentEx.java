package _05_class._d_inheritance;

public class StudentEx {
    public static void main(String[] args) {
       /* //1. public
        Student s1 = new Student("lee", 10, "la");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.campus);
        s1.say();
        s1.eat("banana");
        //자식클래스에서 선언한 메소드
        s1.setCampus("la");*/

        //2. private
        Student std2 = new Student("lee", 10);
        System.out.println("이름 : "+std2.getName());
        System.out.println("나이 : "+std2.getAge());
        System.out.println("캠퍼스 : "+std2.getCampus());

        std2.say();
        std2.eat("banana");
        std2.setCampus("seoul");
        System.out.println(std2.getCampus()+ " 캠퍼스에서 공부 중");

    }
}
