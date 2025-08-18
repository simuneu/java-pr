package _05_class._f_interface;

interface Move{
    void moveForward();
    void moveBackward();
}

interface Power{
    void powerOn();
    void powerOff();
}

//인터페이스는 인터페이스를 상속받을 수 있음.
interface Car extends Move, Power{
    void changeGear(int gear);
}
class Suv implements Car{
    @Override
    public void moveForward(){
        System.out.println("전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("후진");
    }

    @Override
    public void powerOn(){
        System.out.println("시동 온!");
    }

    @Override
    public void powerOff(){
        System.out.println("시동 오프!");
    }

    @Override
    public void changeGear(int gear){
        System.out.println("기어변경 "+gear);
    };
}

public class Interface01 {
    public static void main(String[] args) {
        Suv mySuv = new Suv();
        mySuv.powerOn();
        mySuv.changeGear(2);
        mySuv.moveForward();
        mySuv.changeGear(1);
        mySuv.powerOff();
    }
}
