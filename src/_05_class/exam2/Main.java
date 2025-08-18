package _05_class.exam2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====버스====");
        Bus bus = new Bus("hyundai", "city bus", 2022);
        System.out.println(bus.toString());
        bus.start();
        bus.drive();
        bus.stop();

        System.out.println("=====승용차====");
        Car car = new Car("toyota", "camry", 2023);
        System.out.println(car.toString());
        car.start();
        car.drive();
        car.stop();
    }
}
