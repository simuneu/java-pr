package _05_class.exam2;

public class Cat extends Animal{
    public Cat(String breed, String name, int age){
        super(breed, name, age);
    }

    @Override
    public void makeSound(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("cat", "neko", 5);
        System.out.println("종 : " + cat.getBreed());
        System.out.println("이름 : " + cat.getName());
        System.out.println("나이 : " + cat.getAge());
        cat.makeSound("미야우..");
    }
}
