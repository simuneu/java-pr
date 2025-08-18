package _05_class._d_inheritance;


public class DogEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello();
        dog.fetch(); //자식 클래스의 메소드
        dog.makeSound("바우와우..");

        System.out.println("======================");
        Animal cat = new Animal();
        cat.sayHello();
        cat.makeSound("미야우..");
    }
}
