package _02_controll_statement;

public class Exam4 {
    public static void main(String[] args) {
        Exam4 e4 = new Exam4();
        System.out.println(e4.area (5));
        System.out.println(e4.area (4.0,7.0));
        System.out.println(e4.area (6,3));
    }
    public double area (double r){
        return Math.pow(r,2)*3.14;
    }

    public double area (double a, double b){
        return a*b;
    }

    public float area (float c, float d ){
        return (c*d)/2;
    }
}
