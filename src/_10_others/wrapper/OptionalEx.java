package _10_others.wrapper;

import java.util.Optional;

/*Optional타입
값이 있을 수도 있고 없을 수도 있는 상황을 null대신 표현
* */
public class OptionalEx {
    public static void main(String[] args) {
        /*
        * 값이 존재하는 Optional생성
        * of():생성,isPresent():값 조회 */
        Optional<String> opt1 = Optional.of("Hello!");
        System.out.println("opt1은 존재하는가? "+opt1.isPresent());

        //값이 null일수도 있는 경우(null이면 empty Optional생성
        //ofNullable():생성, isEmpty():값 조회, 확인
        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println("opt1은 비어있는가? "+opt2.isEmpty());

        //비어있는 Optional 생성
        Optional<String> opt3 = Optional.empty();
        System.out.println("opt3은 비어있는가? "+opt3.isEmpty());

        //값 꺼내기
        //get(): 값 조회
        System.out.println("opt1= "+ opt1.get());
        //System.out.println("opt2= "+ opt2.get());//NoSuchElementException

        //값이 없으면 기본값 제공
        //value1은 값이 있어 자신의 값이 나오고 value2는 값이 없어서 default값이 나옴
        String value1 = opt1.orElse("default value");
        System.out.println("value1 = "+value1);
        
        String value2 = opt2.orElse("default value");
        System.out.println("value2 = "+value2);
    }
}
