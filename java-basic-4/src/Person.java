// 대문자로 시작 : 클래스
public class Person {
    // 1. 속성(필드, 멤버변수) - 변수형식
    String name;
    int age;
    String address;

    // 2. 생성자(조립 설명서) - Person을 만드는 조립 설명서
        // - 클래스와 이름이 같다 -> 생성자로 인식함
        // - 반환 자료형이 존재하지 않음
        // - 여러 개가 존재할 수 있음

    // 기본 생성자
    Person(){}; // 인스턴스화 시킴

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 기능(함수, 메서드)

    // 함수구조 기능구현
    // void : 반환하지 않는다
    void sayMyName() {
        System.out.println("나의 이름은 " + this.name + "입니다.");
        System.out.println("나의 나이는 " + this.age + "입니다.");
    }

    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

}
