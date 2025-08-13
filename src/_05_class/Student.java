package _05_class; //패키지
//여러 클래스를 가지고 있는 directory
//클래스를 유일하게 만들어주는 식별자 역할 - 같은 패키지 안에 같은 클래스가 존재할 수 없도록 구분
//다른 패키지에서는 이름이 같은 클래스가 존재할 수 있음
//페키지는 특정한 기능을 가지고 있는 클래스를 구분해주는 용도(서로 관련있는 클래스)

public class Student {
    //1. 클래스의 필드
    public String name;
    public int grade;

    //2. 클래스의 생성자
    public Student(String name, int grade){
        //필드 초기화
        this.name= name; //this = Student클래스 자체/ 뒤에 있는 name은 매개변수
        this.grade = grade;
    }
    //3. 클래스의 메소드
    public void goToSchool(){
        System.out.println("go to school...");
    }
    public void study(String subject){
        System.out.println(subject+" 과목 공부 중...");
    }
    public int getGrade(){
        return this.grade;
    }
    public String getTestResult(int score){
        return this.name+" 학생의 점수는 "+score;
    }

    @Override
    public String toString(){
        return "Student {name: "+this.name+", grade: "+this.grade+ "}";
    }
}
