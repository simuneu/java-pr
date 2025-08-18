package _05_class.exam2;

public class Kim extends Student{
    public Kim(String name, String school, int age, int num){
        super(name, school, age, num);
    }

    @Override
    void todo(){
        System.out.println("점심은 김가네 김밥");
    }
}

