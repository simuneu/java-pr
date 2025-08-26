package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a); //10
        changePrimitive(a); //20
        System.out.println(a); //10
    }
    public static void changePrimitive(int x){
        x=20;
    }
}
