package _05_class.exam2;

public class Animal {
    private String breed;
    private String name;
    private int age;
    public Animal(String breed, String name, int age){
        this.age=age;
        this.breed = breed;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public void makeSound(String str){
        System.out.println("동물은 소리를 낸다.");
    }
}
