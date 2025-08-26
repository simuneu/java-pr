package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value=10;
        Data dataB = dataA; //같은 참조값을 복사해서 넣음

        System.out.println(dataA);
        System.out.println(dataB);
        System.out.println(dataA.value);//10
        System.out.println(dataB.value);//10

        dataA.value=20;
        System.out.println(dataA.value);//20
        System.out.println(dataB.value);//20

        dataB.value=30;
        System.out.println(dataA.value);//30
        System.out.println(dataB.value);//30
    }
}
