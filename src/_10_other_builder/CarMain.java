package _10_other_builder;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("Hyundai")
                .build();
        System.out.println("car1 = "+car1);

        Car car2 = new Car.CarBuilder("Tesla")
                .setModel("Model S")
                .setColor("red")
                .build();
        System.out.println("car2 = "+car2);
        Car car3 = new Car.CarBuilder("BMW")
                .setModel("X5 ")
                .setYear(2023)
                .setColor("Black")
                .build();
        System.out.println("car3 = "+car3);
    }
}
