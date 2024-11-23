import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 객체를 인스턴스화 시킬 때
        new Scanner(System.in).nextLine();

        // 2. 변수에 담아줘야 함 (사용자 입력값을 받기 위한 객체)
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int inoutInt = scanner.nextInt();

        // 인스턴스화(실체화) : new 필수
        new Person();

        String name = "John";
        int age = 18;

        // 변수(데이터 저장공간)에 담아줘야 함 => 가변적이어야 함
        Person personA = new Person(inputStr, inoutInt); // Person의 공간이 생성됨
        personA.sayMyName();
        int ret = personA.sum(1, 2);
        System.out.println("ret : " + ret);

        // 인스턴스화
        String name2 = "Steve";
        int age2 = 18;
        // 변수 선언
        Person personB = new Person(name2, age2);
        personB.sayMyName();
        int ret2 = personB.sum(10, 10);
        System.out.println("ret2 : " + ret2);
    }
}




// 인스턴스화 : 클래스로부터 객체를 만드는 과정을 말함 = 만들어진 객체를 '인스턴스' 라고 .