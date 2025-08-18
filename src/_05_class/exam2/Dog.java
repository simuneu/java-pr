package _05_class.exam2;


public class Dog extends Animal{
    public Dog(String breed,String name, int age ){
        super(breed, name, age);
    }

    @Override
    public void makeSound(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("dog", "mung", 3);
        System.out.println("종 : " + dog.getBreed());
        System.out.println("이름 : " + dog.getName());
        System.out.println("나이 : " + dog.getAge());
        dog.makeSound("멍멍멍");


    }
}
