package week02;

public class W08 {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // 비교 - 논리
        System.out.println(result);
        System.out.println("----------------------");

        result = x + 10 < y && y < z; // false && ~~~~
        System.out.println(result);
        System.out.println("----------------------");

        result = x + 2 * 3 > y;
        System.out.println(result);
        System.out.println("----------------------");

        result = (x + 2) * 3 > y;
        System.out.println(result);
    }
}
