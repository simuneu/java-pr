package _05_class.exam2;

public abstract class  Shape {
    String color;
    String type;

    public Shape(String color,String type){
        this.color = color;
        this.type = type;

    }
    String getColor(){
        return this.color;
    }

    String getType(){
        return this.type;
    }

    abstract double calculateArea();

}
