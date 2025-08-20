package _06_generic;

import _05_class._a_access_modifier.pack2.C;
import _05_class._b_static.Calculator;

class Calculate<T extends Number>{
    private T num1;
    private T num2;

    public Calculate(T num1, T num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void setNum1(T num1){
        this.num1 = num1;
    }

    public void setNum2(T num2){
        this.num2 = num2;
    }

    public T getNum1(){
        return num1;
    }

    public T getNum2(){
        return num2;
    }

    public double add(){
        return num1.doubleValue()+num2.doubleValue();
    }
}

public class GenericPr1 {

    public static void main(String[] args) {
        Calculate<Double> cal1 = new Calculate<>(5.0,10.0);
        System.out.println(cal1.add());

        Calculate<Integer> cal2 = new Calculate<>(5,10);
        System.out.println(cal2.add());

    }
}
