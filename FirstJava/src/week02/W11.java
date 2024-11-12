package week02;

public class W11 {
    public static void main(String[] args) {
        // 예제
        boolean flag = true;

        // 주 골격
        // if() {}

        if(1 != 1) {
            // true인 경우
            System.out.println("값이 true 입니다.");
        } else {
            System.out.println("값이 false 입니다.");
        }

        if (1 != 1){
        // 여기가 아니면
        } else if (1 > 3) {
        // 여기, 여기가 아니면
        }else {
        // 여기
        }

        // 조건문
        int number = 2;

        if(number == 1){
            System.out.println("number값은 1입니다.");
        } else if(number == 2){
            System.out.println("number값은 2입니다.");
        }else {
            System.out.println("number값은 모르는 값입니다.");
        }
    }
}
