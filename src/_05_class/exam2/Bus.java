package _05_class.exam2;

public class Bus extends Vehicle{
    public Bus (String brand, String model, int year){
        super(brand, model, year);
    }
    @Override
    public void drive(){
        System.out.println("버스 운전 중...");
    }
}
