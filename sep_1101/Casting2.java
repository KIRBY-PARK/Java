package sep_1101;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // 컴파일 오류 발생
        // intValue = doubleValue;

        // 명시적 형변환
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
