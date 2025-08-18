package _05_class._d_inheritance;

public class Student extends Person{
    //Person = public
   /* public String campus;

    public Student(String name, int age, String campus){
        //super(); //매개변수 전달되지 않으면 생략가능
        this.name = name;
        this.age = age;
        this.campus = campus;
        System.out.println("자식 클래스 생성자 Student(name, age, campus) 실행");
    }

    public void setCampus(String campus){
        this.campus = campus;
        System.out.println(campus+ " 캠퍼스에서 공부 중");
    }*/

    //Person = private
    private String campus;
    public Student(String name, int age){
        super(name, age); //부모 클래스의 생성자에 매개변수 전달하는 경우, 생략 불가능.
    }
    public String getCampus(){
        return this.campus;
    }
    public void setCampus(String campus){
        this.campus= campus;
    }

}
