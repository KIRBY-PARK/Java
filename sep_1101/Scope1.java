package sep_1101;

public class Scope1 {
    public static void main(String[] args) {
        // m 생존 시작
        int m = 10;

        if (true) {
            // x 생존 시작
            int x = 20;

            // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료

        // 오류, 변수 x에 접근 불가
        // System.out.println("if x = " + x);
        System.out.println("if m = " + m);
    } // m 생존 종료
}
