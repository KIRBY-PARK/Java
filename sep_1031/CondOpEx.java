package sep_1031;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // a와 b중에 a가 더 크면 a, 아니면 b
        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
