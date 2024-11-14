package week03.sample;

// 지역변수
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    // 기본 생성자 생략 가능
    //public main(){}

    // 메서드
    public int getNumber(){
        // [ 지역변수 ] <-> 전역변수(지역변수의 반대되는 개념)
        // 해당 메서드가 실행될 때마다 독립적인 값을 저장하고 관리함
        // 이 지역변수는 메서드 내부에서 정의될 때 생성됨
        // 이 메서드가 종료될 때 소멸됨
        int number = 1;
        number += 1;
        return number;
    }
}
