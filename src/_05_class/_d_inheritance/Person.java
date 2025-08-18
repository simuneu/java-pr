package _05_class._d_inheritance;
//parent class
public class Person {
    //1. public
//    public String name;
//    public int age;
//    public Person(){
//        System.out.println("부모 클래스  person() 실행 시작");
//    }

    //2. private
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age= age;
    }
    //getter setter

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public void say(){
        System.out.println("hello");
    }
    public void eat(String food){
        System.out.println("eating "+food);
    }





}
