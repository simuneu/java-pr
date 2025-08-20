package _05_class.exam2;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("===김철수 학생 정보===");
        Kim  kim = new Kim("김철수", "ABC 고등학교", 17, 2022);
        System.out.println("이름: " + kim.getName());
        System.out.println("학교: " + kim.getSchool());
        System.out.println("나이: " + kim.getAge());
        System.out.println("학번: " + kim.getNum());
        kim.todo();

        System.out.println("===백영희 학생 정보===");
        Baek  baek = new Baek("백영희", "XYZ 고등학교", 18, 2023);
        System.out.println("이름: " + kim.getName());
        System.out.println("학교: " + kim.getSchool());
        System.out.println("나이: " + kim.getAge());
        System.out.println("학번: " + kim.getNum());
        baek.todo();
    }
}