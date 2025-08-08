package _01basic;

public class Casting {
    public static void main(String[] args) {
        //묵시적 형변환
        //작은 타입에서 큰 타입으로 자동형변환-반대의 경우는 자동으로 형변환되지 않음(명시적 변환 필수)
        int smallerNumber = 10;
        double bigNumber = smallerNumber;
        System.out.println("bigNumber"+bigNumber); //int > double

        //명시적 형변환
        double anotherBigNumber = 20.7;
        int anotherSmallNumber = (int)anotherBigNumber; //double에서 int로.
        System.out.println("anotherBigNumber: "+anotherBigNumber);
        System.out.println("anotherSmallNumber: "+anotherSmallNumber); //데이터 유실발생 가능성

        int largeNumber = 1000;
        byte smallByte = (byte)largeNumber;

        System.out.println("largeNumber:"+largeNumber);
        System.out.println("smallByte:"+smallByte);
        //데이터 손실이 일어날 수 있으니 주의
    }
}
