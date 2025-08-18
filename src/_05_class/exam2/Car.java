package _05_class.exam2;

public class Car extends Vehicle{
    public Car (String brand, String model, int year){
        super(brand, model, year);
    }
    @Override
    public void drive(){
        System.out.println("차 운전 중...");
    }
}
