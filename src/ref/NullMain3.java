package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
//        bigData.data = new Data(); // 참조값을 주면 에러 안남
        System.out.println(bigData.count); //0
        System.out.println(bigData.data);//null

        System.out.println(bigData.data.value); //n.p.e
    }
}
