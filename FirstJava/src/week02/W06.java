package week02;

public class W06 {
    public static void main(String[] args) {
        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + b--; // 20이 나오게 계산하고자 한다면 --b로 증감연산자의 위치를 변경해야 함
        System.out.println(a); // 11
        System.out.println(b); // 9
        System.out.println(val); // 21
    }
}
