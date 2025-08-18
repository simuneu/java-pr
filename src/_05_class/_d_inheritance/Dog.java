package _05_class._d_inheritance;

public class Dog extends Animal{
    //name, makeSound(), sayHello()
    @Override //부모 메소드를 새 내용으로 재정의
    //컴파일러가 정확히 오버라이딩 되었는지 체크(생략 가능)
    //오버라이딩 할 떄는 함수이름, 리턴타입, 매개변수 타입이 모두 일치해야 함.
    void makeSound(String t){
        System.out.println("이름 " +super.name);
        super.makeSound(t); //부모 메소드를 호출해줄 수 있음
    }
    
    void fetch(){
        System.out.println("공 가져와");
    }
}
