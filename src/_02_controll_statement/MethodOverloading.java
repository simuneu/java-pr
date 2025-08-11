package _02_controll_statement;
/*
하나의 클래스에서 동일한 이름의 메서드 타입을 여러 개 정의할 수 있음.
* 함수 이름은 같지만, 매개변수의 타입, 개수, 함수의 리턴값을 다르게 하고
* 함수의 동작이 유사할 떄 사용 가능
* */
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading ol = new MethodOverloading();//static이 아닌 method사용을 위해 객체 셍성

        System.out.println(ol.add(1,2));
        System.out.println(ol.add(1,2, 3));
        System.out.println(ol.add(1.1,2.1));
        System.out.println(ol.add(1.1,2.1, 4.4));
        System.out.println(ol.add("반갑", "묘!"));
    }
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b, double c){
        return a+b+c;
    }

    public String add(String a, String b){
        return a+b;
    }
}
