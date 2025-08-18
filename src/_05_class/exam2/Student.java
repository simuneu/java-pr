package _05_class.exam2;

public abstract class Student {
    private String name;
    private String school;
    private int age;
    private int num;

    public Student(String name, String school, int age, int num){
        this.name = name;
        this.school = school;
        this.age = age;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNum(int num) {
        this.num = num;
    }

    abstract void todo();
}
