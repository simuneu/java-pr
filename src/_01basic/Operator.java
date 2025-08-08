package _01basic;

public class Operator {
    public static void main(String[] args) {
        int x,y;
        float a,b;
        x=11;
        y=3;
        a=11.0f;
        b=3.0f;
        System.out.println("===정수형 연산===");
        System.out.println("x+y="+(x+y));
        System.out.println("x-y="+(x-y));
        System.out.println("x*y="+(x*y));
        System.out.println("x/y="+(x/y));
        System.out.println("x%y="+(x%y));
        System.out.println("x^3="+Math.pow(x,3)); //실수형으로 출력됨

        System.out.println("===실수형 연산===");
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("a^3="+Math.pow(a,3)); //실수형으로 출력됨

        x=10;
        //증감 연산자
        System.out.println("===증감 연산===");
        System.out.println("x++ " + x++ + ' ' + x); // 후위 증가 10 11
        System.out.println("++x "+ ++x + ' ' + x); // 전위 증가 12 12
        System.out.println("x-- " + x-- + ' ' + x); // 후위 감소 12 11
        System.out.println("--x " + --x + ' ' + x); // 전위 감소 10 10

        //산술대입연산자
        System.out.println("===산술대입 연산===");
        System.out.println("x= " + x); // 후위 증가 10 11
        System.out.println("x+=5 "+(x+=5));
        System.out.println("x-=5 "+(x-=5));
        System.out.println("*=5 "+(x*=5));
        System.out.println("/+=5 "+(x/=5));
        System.out.println("x%=5 "+(x%=5));

        System.out.println("===비교 연산===");
        System.out.println("a , b: "+a+" "+b);
        System.out.println("a > b: "+(a>b));
        System.out.println("a >= b: "+(a>=b));
        System.out.println("a < b: "+(a<b));
        System.out.println("a <= b: "+(a<=b));
        System.out.println("a == b: "+(a==b));
        System.out.println("a != b: "+(a!=b));
        
        //논리
        boolean j = true;
        boolean k = false;
        boolean l = true;
        System.out.println("===논리 연산===");
        System.out.println("j&&k "+(j&&k)); //and
        System.out.println("j||k "+(j||k)); //or
        System.out.println("j&&l "+(j&&l));
        System.out.println("j||l "+(j||l));
        System.out.println("!j "+(!j)); //not
        
        //삼항연산자
        System.out.println("===삼항연산자===");
        System.out.println(x>y?"x는 y보다 큼":"x는y보다 크지 않음");
        
    }
}
