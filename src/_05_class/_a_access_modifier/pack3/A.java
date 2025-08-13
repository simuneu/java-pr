package _05_class._a_access_modifier.pack3;

public class A {
    public int field1;
    int field2;
    private int field3;



    public void method1(){
        System.out.println("public method");
    }
    void method2(){
        System.out.println("default method");
    }
    private void method3(){
        System.out.println("private method");
    }

    public A(){
        this.field1 = 1;
        this.field2 = 2;
        this.field3 = 3;

        method1();
        method2();
        method3();
    }
}
