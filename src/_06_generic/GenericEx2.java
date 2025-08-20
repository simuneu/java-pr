package _06_generic;

//Number 클래스(숫자 형식의 부모 클래스)
//정수, 실수형 모두 포함
//Byte, Short, Integer, Lang, Float, Double

//generic 클래스 제한
//T 타입은 Number를 상속받은 클래스만 허용
class Box<T extends Number>{
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}

interface  Movable{
    void move();
}

class Container<T extends Movable>{
    private T item;

    public Container(T item){
        this.item = item;
    }

    public void makeItMove(){
        item.move(); //public void move를 실행시켜 줌
    }
}

class Car implements Movable{
    @Override
    public void move(){
        System.out.println("자동차 출발");
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.setItem(10);
        System.out.println("box1's item : "+box1.getItem() );

        Box<Double> box2 = new Box<>();
        box2.setItem(10.0);
        System.out.println("box1's item : "+box2.getItem() );

        Box<Short> box3 = new Box<>();
        //정수형 리터럴은 기본적으로 int로 간주되어
        //short 타입으로 설정할 때는 명시적으로 형변환 후 사용해야 함.
        box3.setItem((short)30);
        System.out.println("box1's item : "+box3.getItem() );

        /// //////extents Movable/////////
        Container<Car> car = new Container<>(new Car());
        car.makeItMove();
    }
}
