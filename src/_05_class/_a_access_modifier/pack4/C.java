package _05_class._a_access_modifier.pack4;

import _05_class._a_access_modifier.pack3.A;

public class C {
    public static void main(String[] args) {
        A a = new A();

        a.field1=111;
//        a.field2=222;//default라서 다른 패키지에서는 접근 불가

        System.out.println(a.field1);
//        System.out.println(a.field2);//default라서 다른 패키지에서는 접근 불가
//        System.out.println(a.field3) //private 접근 불가;

        a.method1();
//        a.method2(); //default라서 다른 패키지에서는 접근 불가
//        a.method3();//private 접근 불가
    }
}
