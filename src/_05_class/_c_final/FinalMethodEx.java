package _05_class._c_final;

public class FinalMethodEx {
    public static void main(String[] args) {

    }
}

class ClassWithFinalMethod{
    final void showMessage(){
        System.out.println("이 메소드는 final로 선언되어있음");
    }
}

class SubClass extends ClassWithFinalMethod{
//    void showMessage(){
//        //메소드 재정의 불가
//        //오버라이딩 불가
//
//    }
}

final class FinalClass{
    //클래스에도 final 가능
}

// class SubClass2 extends FinalClass{} // error