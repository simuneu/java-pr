package _05_class._a_access_modifier.pack3;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.field1);
        System.out.println(a.field2);
//        System.out.println(a.field3) //private 접근 불가;

        a.field1=11;
        a.field2=22;

        a.method1();
        a.method2();
//        a.method3();//private 접근 불가
    }

}
