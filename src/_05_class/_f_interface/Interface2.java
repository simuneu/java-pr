package _05_class._f_interface;

abstract class MyAbstractClass{
    public abstract void abstractMethod();
}

interface MyInterface{
    void interfaceMethod();
}

public class Interface2 extends MyAbstractClass implements MyInterface{
    @Override
    public void abstractMethod(){
        System.out.println("추상 클래스로부터 상속받은 메소드");
    }

    @Override
    public void interfaceMethod(){
        System.out.println("인터페이스로부터 상속받은 메소드");
    }

    public static void main(String[] args) {
        Interface2 test = new Interface2();
        test.abstractMethod();
        test.interfaceMethod();
        test.interfaceMethod();
    }
}
