package _10_others.wrapper;
/*Wrapper : 기본타입 값을 갖는 객체 생성 가능
    포장 객체를 생성하기 위한 클래스는 java.lang 패키지에 포함되어있음
    포장 객체는 포장하고 있는 기본 타입의 값을 변경할 수 있고, 단지 객체를 생성하는 목적이 있음
    컬렉션 객체 때문.
    컬렉션 객체 - 기본타입의 값을 저장할 수 없고, 객체만 저장 가능하기 때문.
    기본형 데이터를 객체처럼 다룰 수 있게 해주는 클래스, 컬렉션/제네릭/null표현 등에 꼭 필요함
* */
public class BoxingUnboxingEx {
    public static void main(String[] args) {
        //Boxing - 기본 타입의 값을 포장 객체로 만드는 과정
            //포장 클래스 변수에 값이 대입될 때 발생
        Integer obj1 = 200;
        System.out.println(obj1);
        Double obj2 = 3.14;
        System.out.println(obj2);
        Character obj3 = 'A';
        System.out.println(obj3);

        //명시적 언박싱: 자료형Value()method
        //코드 명확성과 특정 상황에서 안정성을 위해 사용되는 메서드
        //객체 값이 null일 때 자동 언박싱은 NullPointException을 발생
        //자료형Value()메서드를 사용하면 더 명확한 처리 가능
        System.out.printf("int value: %d %n", obj1.intValue());
        System.out.printf("double value: %.2f %n", obj2.doubleValue());
        System.out.printf("char value: %c %n", obj3.charValue());
        System.out.println();

        //연산시 boxing
        int result1=obj1+100; //obj1은 100과 연산되기 전에 언박싱
        System.out.println("result1= "+result1);

        double result2= obj2+1.5;
        System.out.println("result2= "+result2);

        char result3 = (char)(obj3+1);
        System.out.println("result3= "+result3);
    }
}
