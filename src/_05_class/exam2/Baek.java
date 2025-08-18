package _05_class.exam2;

public class Baek extends Student{
    public Baek(String name, String school, int age, int num){
        super(name, school, age, num);
    }

    @Override
    void todo(){
        System.out.println("점심은 백종원 피자");
    }
}

