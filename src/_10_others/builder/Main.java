package _10_others.builder;

public class Main {
    public static void main(String[] args) {
        //빌터패턴 사용 객체 생성
        //Student std2 = new Student("lee)
        //                     .setAge(5)
        //                     .setGrade(1)
        //                     .setAddress("LA")
        //                     .build();
        Computer com1 = new Computer.ComputerBuilder("Intel i5")
                .setRam(8)
                .setStorage(256)
                .build();
        System.out.println("com1 = "+com1);

        Computer com2 = new Computer.ComputerBuilder("AMD Ryzen 7")
                .setRam(32)
                .setGpu("NVIDIA RTX 3080")
                .setStorage(1000)
                .build();
        System.out.println("com2 = "+com2);
    }
}


//Builder 패턴
/*
- 객체 생성을 직관적이고 안전하ㅔ 만들어주는 디자인 패턴
- lombok 라이브러리의 빌더 어노테이션을 이용하면 자동으로 빌더 클래스 생성

장)
1. 가독성 향상
2. 유연성 : 필요한 데이터만 선택적으로 설정
3. 불변성 : 객체 생성 후에 변경할 수 없게 만듦
4. 매개변수 순서 문제 해결 : 생성자의 매개변수 순서를 기억할 필요없음
*/


