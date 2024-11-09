
// 클래스
// public : (접근)제어자, public (공공의, 공동의)

public class Main { // 2개의 클래스명을 동일하게 작성해야 함

    // JDK
    // (1) compiler : .java -> .class
    // (2) JRE
    // (3) JDB : 디버깅 (버그를 없애기 위해 면밀히 살펴보겠다 라는 과정)

    // () : 소괄호
    // {} : 중괄호
    // [] : 대괄호

    // 소괄호 앞에 있는 main 메소드
    // 자바 프로젝트(앱)는 제일 먼저 클래스의 main 메소드를 실행시킨다.
    // = JVM의 약속

    // static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현

    // input
    // String[] args  : 매개변수 자리

    // output
    // void : 메서드의 출력값의 데이터 타입
    // void : "아무것도 없다." -> 출력은 없다. (return을 써줘야 출력이 있음)

    // args : input에 대한 변수명 (아무거나 써도 상관 없음, 변수명을 통해 중괄호 안에서 사용할 수 있음)

    public static void main(String[] args) {

        // 객체 : 특징(속성, 변수), 행동(메소드)
        // System : 클래스 (마우스를 올려 확인 가능)
        // . : 하위요소를 표현할 때 사용함
        // .out :  System 안에 있는 객체
        // .println : 행동을 정의하는 메소드 (출력) / 줄을 바꿔주는 출력
        // .print : 줄을 바꾸지 않는 출력
        // ln : 라인을 의미함
        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");
    }
}

// 미션 1. 7 출력 (숫자를 ""로 감싸면 문자열로 인식해서 숫자로 인식을 원하면 ""를 빼야함)
// 미션 2. 3 출력
// 미션 3. 3.14 출력
// 미션 4. JAVA 출력